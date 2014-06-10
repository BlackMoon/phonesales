/**
 * 
 */
package org.bm.ejb_AndryukhinNU;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import org.bm.model_AnryukhinNU.Office_AndryukhinNU;
import org.bm.model_AnryukhinNU.Phone_AndryukhinNU;
import org.bm.model_AnryukhinNU.Sale_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@LocalBean
@Stateless
public class SaleEjbBean_AndryukhinNU extends DBEjbBean_AndryukhinNU<Sale_AndryukhinNU> {
	
	private Office_AndryukhinNU loadOffice(int id){
		return (Office_AndryukhinNU)em.createQuery("SELECT o FROM Office o WHERE o.id = ?").setParameter(1, id).getSingleResult();
	}
	
	private Phone_AndryukhinNU loadPhone(int id){
		return (Phone_AndryukhinNU)em.createQuery("SELECT p FROM Phone p WHERE p.id = ?").setParameter(1, id).getSingleResult();
	}

	@Override
	public int add(Sale_AndryukhinNU s) {
		
		s.setOffice(loadOffice(s.getOfficeid()));
		s.setPhone(loadPhone(s.getPhoneid()));
		
        return super.add(s);
	}	
	
	public List<Sale_AndryukhinNU> getAll() {        
		TypedQuery<Sale_AndryukhinNU> namedQuery = em.createNamedQuery("Sale.getAll", Sale_AndryukhinNU.class);
        return namedQuery.getResultList();
	}	
	
	public Sale_AndryukhinNU get(int id) {
		return em.find(Sale_AndryukhinNU.class, id);
	}	
	
	public void delete(int id) {
		super.delete(get(id));		
	}	

	
}
