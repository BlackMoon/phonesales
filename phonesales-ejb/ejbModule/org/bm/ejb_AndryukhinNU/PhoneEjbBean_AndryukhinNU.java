/**
 * 
 */
package org.bm.ejb_AndryukhinNU;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import org.bm.model_AnryukhinNU.Manufactor_AndryukhinNU;
import org.bm.model_AnryukhinNU.Phone_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@LocalBean
@Stateless
public class PhoneEjbBean_AndryukhinNU extends DBEjbBean_AndryukhinNU<Phone_AndryukhinNU> {
	
	private Manufactor_AndryukhinNU loadManufactor(int id){
		return (Manufactor_AndryukhinNU)em.createQuery("SELECT m FROM Manufactor m WHERE m.id = ?").setParameter(1, id).getSingleResult();
	}
	
	@Override
	public int add(Phone_AndryukhinNU p) {
		p.setManufactor(loadManufactor(p.getManufactorid()));
        return super.add(p);
	}		
	
	public List<Phone_AndryukhinNU> getAll() {        
		TypedQuery<Phone_AndryukhinNU> namedQuery = em.createNamedQuery("Phone.getAll", Phone_AndryukhinNU.class);
        return namedQuery.getResultList();
	}	
	
	public Phone_AndryukhinNU get(int id) {
		return em.find(Phone_AndryukhinNU.class, id);
	}
	
	public int getNewId(){
		int newid = 1;
		
		Object o = em.createQuery("SELECT MAX(p.id) + 1 FROM Phone p").getSingleResult();		
		return (o != null) ? (int)o : newid;		
	}	
	
	public void delete(int id) {
		super.delete(get(id));		
	}
	
	public void update(Phone_AndryukhinNU p) {
		p.setManufactor(loadManufactor(p.getManufactorid()));
		super.update(p);		
	}

}
