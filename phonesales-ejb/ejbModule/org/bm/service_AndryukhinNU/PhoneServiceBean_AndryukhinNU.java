/**
 * 
 */
package org.bm.service_AndryukhinNU;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.bm.ejb_AndryukhinNU.PhoneEjbBean_AndryukhinNU;
import org.bm.model_AnryukhinNU.Phone_AndryukhinNU;

/**
 * @author Black Moon
 *
 */
@Stateless
@WebService(portName="Phone", targetNamespace="http://phone.org")
public class PhoneServiceBean_AndryukhinNU {
	
	@EJB
	PhoneEjbBean_AndryukhinNU	dao;
	
	public List<Phone_AndryukhinNU> getAllPhones() {        
		return dao.getAll();
	}	
	
	public Phone_AndryukhinNU getPhone(int id) {
		return dao.get(id);
	}		
	
	public int addPhone(Phone_AndryukhinNU m) {
		return dao.add(m);		
	}
	
	public int getNewPhoneId(){
		return dao.getNewId();		
	}	
	
	public void deletePhone(int id) {
		dao.delete(id);		
	}
	
	public void updatePhone(Phone_AndryukhinNU p) {
		dao.update(p);		
	}	
}
