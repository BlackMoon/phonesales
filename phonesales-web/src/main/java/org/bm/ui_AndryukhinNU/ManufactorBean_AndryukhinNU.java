/**
 * 
 */
package org.bm.ui_AndryukhinNU;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.bm.service.manufactor.ManufactorAndryukhinNU;
import org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU;
import org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNUServiceLocator;
import org.icefaces.ace.component.celleditor.CellEditor;
import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;
import org.icefaces.ace.model.table.RowState;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="manufactorBean")
@ViewScoped
public class ManufactorBean_AndryukhinNU extends GridBean_AndryukhinNU<ManufactorAndryukhinNU> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridManufactors"; 
	private static final String ADDRESS = "http://localhost:8080/ManufactorServiceBean_AndryukhinNUService/ManufactorServiceBean_AndryukhinNU?wsdl";
	
	ManufactorServiceBean_AndryukhinNU mb;
	
	@PostConstruct
    public void init() {
		try {
			mb = new ManufactorServiceBean_AndryukhinNUServiceLocator().getManufactor(new java.net.URL(ADDRESS));
			
			items = new ArrayList<ManufactorAndryukhinNU>();
			for (ManufactorAndryukhinNU m: mb.getAllManufactors())
			{
				items.add(m);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void add() {
		ManufactorAndryukhinNU item = new ManufactorAndryukhinNU();
		try {
			item.setId(mb.getNewManufactorId());
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
			ManufactorAndryukhinNU m = (ManufactorAndryukhinNU)o;
			if (!isNew)
				
				try {
					mb.deleteManufactor(m.getId());
				} 
				catch (RemoteException ex) {
					ex.printStackTrace();
				}
			
			items.remove(m);
		}
		
		isSelected = false;
	}
	
	@Override
	public void edit(RowEditEvent e) {
		
		ManufactorAndryukhinNU m = (ManufactorAndryukhinNU)e.getObject();
		
		try 
		{	
			if (isNew)
			{ 
				mb.addManufactor(m);			
				isNew = false;
			}
			else
				mb.updateManufactor(m);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	}

}
