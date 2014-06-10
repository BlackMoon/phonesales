/**
 * 
 */
package org.bm.ejb_AndryukhinNU;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import org.bm.model_AnryukhinNU.Office_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@LocalBean
@Stateless
public class OfficeEjbBean_AndryukhinNU extends DBEjbBean_AndryukhinNU<Office_AndryukhinNU> {
	
	public List<Office_AndryukhinNU> getAll() {        
		TypedQuery<Office_AndryukhinNU> namedQuery = em.createNamedQuery("Office.getAll", Office_AndryukhinNU.class);
        return namedQuery.getResultList();
	}	
	
	public Office_AndryukhinNU get(int id) {
		return em.find(Office_AndryukhinNU.class, id);
	}	
		
	public int getNewId(){
		int newid = 1;
		
		Object o = em.createQuery("SELECT MAX(o.id) + 1 FROM Office o").getSingleResult();		
		return (o != null) ? (int)o : newid;		
	}	
	
	public void delete(int id) {
		super.delete(get(id));		
	}	

}
