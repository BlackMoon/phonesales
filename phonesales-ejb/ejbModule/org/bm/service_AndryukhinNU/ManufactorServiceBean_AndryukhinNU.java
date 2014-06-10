/**
 * 
 */
package org.bm.service_AndryukhinNU;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.bm.ejb_AndryukhinNU.ManufactorEjbBean_AndryukhinNU;
import org.bm.model_AnryukhinNU.Manufactor_AndryukhinNU;

/**
 * @author Black Moon *

*/
@Stateless
@WebService(portName="Manufactor", targetNamespace="http://manufactor.org")
public class ManufactorServiceBean_AndryukhinNU {
	
	@EJB
	ManufactorEjbBean_AndryukhinNU	dao;
	
	public List<Manufactor_AndryukhinNU> getAllManufactors() {        
		return dao.getAll();
	}	
	
	public Manufactor_AndryukhinNU getManufactor(int id) {
		return dao.get(id);
	}		
	
	public int addManufactor(Manufactor_AndryukhinNU m) {
		return dao.add(m);		
	}
	
	public int getNewManufactorId(){
		return dao.getNewId();		
	}	
	
	public void deleteManufactor(int id) {
		dao.delete(id);		
	}
	
	public void updateManufactor(Manufactor_AndryukhinNU o) {
		dao.update(o);		
	}	
}
