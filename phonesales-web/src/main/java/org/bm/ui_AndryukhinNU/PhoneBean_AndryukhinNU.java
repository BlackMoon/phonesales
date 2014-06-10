/**
 * 
 */
package org.bm.ui_AndryukhinNU;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.bm.service.phone.PhoneAndryukhinNU;
import org.bm.service.phone.PhoneServiceBean_AndryukhinNU;
import org.bm.service.phone.PhoneServiceBean_AndryukhinNUServiceLocator;
import org.icefaces.ace.component.celleditor.CellEditor;
import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;
import org.icefaces.ace.model.table.RowState;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="phoneBean")
@ViewScoped
public class PhoneBean_AndryukhinNU extends GridBean_AndryukhinNU<PhoneAndryukhinNU> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridPhones"; 
	private static final String ADDRESS = "http://localhost:8080/PhoneServiceBean_AndryukhinNUService/PhoneServiceBean_AndryukhinNU?wsdl";
	
	PhoneServiceBean_AndryukhinNU pb;
	
	@ManagedProperty(value="#{manufactorBean}")
	private ManufactorBean_AndryukhinNU manufactorBean;	 
	
	public ManufactorBean_AndryukhinNU getManufactorBean() {
		return manufactorBean;
	}

	public void setManufactorBean(ManufactorBean_AndryukhinNU manufactorBean) {
		this.manufactorBean = manufactorBean;
	}
	
	@PostConstruct
    public void init() {
		try {
			pb = new PhoneServiceBean_AndryukhinNUServiceLocator().getPhone(new java.net.URL(ADDRESS));
			
			items = new ArrayList<PhoneAndryukhinNU>();
			for (PhoneAndryukhinNU p: pb.getAllPhones())
			{
				items.add(p);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void add() {
		PhoneAndryukhinNU item = new PhoneAndryukhinNU();
		try {
			item.setId(pb.getNewPhoneId());
			items.add(item);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		
		UIComponent u = FacesContext.getCurrentInstance().getViewRoot().findComponent(SELECTOR); 
		DataTable table = (DataTable)u;
		 
		RowState itemState = stateMap.get(item); 
		
		for (org.icefaces.ace.component.column.Column c : table.getColumns()) { 
			CellEditor editor = c.getCellEditor(); 
			
			if (editor != null)			
				itemState.addActiveCellEditor(editor);			
		}
		
		isNew = true;
		
	}
	
	@Override
	public void delete(ActionEvent e) {
		
		for (Object o : stateMap.getSelected())
		{
			PhoneAndryukhinNU p = (PhoneAndryukhinNU)o;
			if (!isNew)
				
				try {
					pb.deletePhone(p.getId());
				} 
				catch (RemoteException ex) {
					ex.printStackTrace();
				}
			
			items.remove(p);
		}
		
		isSelected = false;
	}
	
	@Override
	public void edit(RowEditEvent e) {
		
		PhoneAndryukhinNU p = (PhoneAndryukhinNU)e.getObject();
		
		try 
		{
			p.setManufactor(manufactorBean.get(p.getManufactorid()));

			
			if (isNew)
			{ 
				pb.addPhone(p);			
				isNew = false;
			}
			else
				pb.updatePhone(p);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	}
	
	public PhoneAndryukhinNU get(int id) throws RemoteException{
		
		return pb.getPhone(id);
	}

}
