/**
 * 
 */
package org.bm.ejb_AndryukhinNU;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.bm.model_AnryukhinNU.Person_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@LocalBean
@Stateless
public class PersonEjbBean_AndryukhinNU extends DBEjbBean_AndryukhinNU<Person_AndryukhinNU> {
	
	@Override
	public int add(Person_AndryukhinNU p) {        
		
		String passwd = p.getPassword(), salt = null;
		
		if (passwd != null && passwd.length() > 0) {
			salt = RandomStringUtils.random(16, "abcdef0123456789");
			passwd = DigestUtils.sha256Hex(passwd + "{" + salt + "}");
		}
		p.setPassword(passwd);
		p.setSalt(salt);
		
        return super.add(p);
	}	

	public List<Person_AndryukhinNU> getAll() {        
		TypedQuery<Person_AndryukhinNU> namedQuery = em.createNamedQuery("Person.getAll", Person_AndryukhinNU.class);
        return namedQuery.getResultList();
	}	
	
	public Person_AndryukhinNU get(int id) {
		return em.find(Person_AndryukhinNU.class, id);
	}
	
	public Person_AndryukhinNU getByLogin(String login) {		
		return (Person_AndryukhinNU)em.createQuery("SELECT p FROM Person p WHERE p.login = ?").setParameter(1, login).getSingleResult();
	}
	
	public int getNewId(){
		return (int)em.createQuery("SELECT MAX(p.id) + 1 FROM Person p").getSingleResult();		
	}		
	
	public void delete(int id) {
		super.delete(get(id));		
	}
	
	@Override
	public void update(Person_AndryukhinNU p) {
		String passwd = p.getPassword(), salt = null;
		
		if (passwd != null && passwd.length() > 0) {
			salt = RandomStringUtils.random(16, "abcdef0123456789");
			passwd = DigestUtils.sha256Hex(passwd + "{" + salt + "}");
		}
		p.setPassword(passwd);
		p.setSalt(salt);
		
		super.update(p);
	}
}
