/**
 * 
 */
package org.bm.ejb_AndryukhinNU;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import org.bm.model_AnryukhinNU.Manufactor_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@LocalBean
@Stateless
public class ManufactorEjbBean_AndryukhinNU extends DBEjbBean_AndryukhinNU<Manufactor_AndryukhinNU> {	

	public List<Manufactor_AndryukhinNU> getAll() {        
		TypedQuery<Manufactor_AndryukhinNU> namedQuery = em.createNamedQuery("Manufactor.getAll", Manufactor_AndryukhinNU.class);
        return namedQuery.getResultList();
	}	
	
	public Manufactor_AndryukhinNU get(int id) {
		return em.find(Manufactor_AndryukhinNU.class, id);
	}	
	
	public int getNewId(){
		return (int)em.createQuery("SELECT MAX(m.id) + 1 FROM Manufactor m").getSingleResult();		
	}		
	
	public void delete(int id) {
		super.delete(get(id));		
	}
}
