/**
 * 
 */
package org.bm.ui_AndryukhinNU;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.icefaces.ace.event.RowEditEvent;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="manufactorBean")
@ViewScoped
public class ManufactorBean_AndryukhinNU extends GridBean_AndryukhinNU<String> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridManufactors"; 
	
	@PostConstruct
    public void init() {
		
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void delete(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void edit(RowEditEvent e) {
		// TODO Auto-generated method stub
		
	}

}