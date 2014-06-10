/**
 * 
 */
package org.bm.service_AndryukhinNU;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.bm.ejb_AndryukhinNU.OfficeEjbBean_AndryukhinNU;
import org.bm.model_AnryukhinNU.Office_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@Stateless
@WebService(portName="Office", targetNamespace="http://office.org")
public class OfficeServiceBean_AndryukhinNU {
	
	@EJB
	OfficeEjbBean_AndryukhinNU	dao;
	
	public List<Office_AndryukhinNU> getAllOffices() {        
		return dao.getAll();
	}	
	
	public Office_AndryukhinNU getOffice(int id) {
		return dao.get(id);
	}		
	
	public int addOffice(Office_AndryukhinNU o) {
		return dao.add(o);		
	}
	
	public int getNewOfficeId(){
		return dao.getNewId();		
	}	
	
	public void deleteOffice(int id) {
		dao.delete(id);		
	}
	
	public void updateOffice(Office_AndryukhinNU o) {
		dao.update(o);		
	}	
}
