/**
 * 
 */
package org.bm.service_AndryukhinNU;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.bm.ejb_AndryukhinNU.SaleEjbBean_AndryukhinNU;
import org.bm.model_AnryukhinNU.Sale_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@Stateless
@WebService(portName="Sale", targetNamespace="http://sale.org")
public class SaleServiceBean_AndryukhinNU {
	
	@EJB
	SaleEjbBean_AndryukhinNU	dao;
	
	public List<Sale_AndryukhinNU> getAllSales() {        
		return dao.getAll();
	}	
	
	public Sale_AndryukhinNU getSale(int id) {
		return dao.get(id);
	}		
	
	public int addSale(Sale_AndryukhinNU s) {
		return dao.add(s);		
	}	
	
	public void deleteSale(int id) {
		dao.delete(id);		
	}
	
	public void updateSale(Sale_AndryukhinNU s) {
		dao.update(s);		
	}	

}
