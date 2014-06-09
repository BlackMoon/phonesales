/**
 * 
 */
package org.bm.service_AndryukhinNU;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.bm.ejb_AndryukhinNU.PersonEjbBean_AndryukhinNU;
import org.bm.model_AnryukhinNU.Person_AndryukhinNU;
/**
 * @author Black Moon
 *
 */
@Stateless
@WebService(portName="Person", targetNamespace="http://person.org")
public class PersonServiceBean_AndryukhinNU {
	
	@EJB
	PersonEjbBean_AndryukhinNU	dao;
	
	public List<Person_AndryukhinNU> getAllPersons() {        
		return dao.getAll();
	}	
	
	public Person_AndryukhinNU getPerson(int id) {
		return dao.get(id);
	}		
	
	public int addPerson(Person_AndryukhinNU p) {
		return dao.add(p);		
	}
	
	public int getNewPersonId(){
		return dao.getNewId();		
	}	
	
	public void deletePerson(int id) {
		dao.delete(id);		
	}
	
	public void updatePerson(Person_AndryukhinNU p) {
		dao.update(p);		
	}
	
	public Person_AndryukhinNU getByLogin(String login) {
		return dao.getByLogin(login);
	}	
}
