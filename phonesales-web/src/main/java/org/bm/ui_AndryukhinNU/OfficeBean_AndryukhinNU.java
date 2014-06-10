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

import org.bm.service.office.OfficeAndryukhinNU;
import org.bm.service.office.OfficeServiceBean_AndryukhinNU;
import org.bm.service.office.OfficeServiceBean_AndryukhinNUServiceLocator;
import org.icefaces.ace.component.celleditor.CellEditor;
import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;
import org.icefaces.ace.model.table.RowState;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="officeBean")
@ViewScoped
public class OfficeBean_AndryukhinNU extends GridBean_AndryukhinNU<OfficeAndryukhinNU> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridOffices"; 
	private static final String ADDRESS = "http://localhost:8080/OfficeServiceBean_AndryukhinNUService/OfficeServiceBean_AndryukhinNU?wsdl";
	
	OfficeServiceBean_AndryukhinNU ob;
	
	@PostConstruct
    public void init() {
		try {
			ob = new OfficeServiceBean_AndryukhinNUServiceLocator().getOffice(new java.net.URL(ADDRESS));
			
			items = new ArrayList<OfficeAndryukhinNU>();
			for (OfficeAndryukhinNU o: ob.getAllOffices())
			{
				items.add(o);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void add() {
		OfficeAndryukhinNU item = new OfficeAndryukhinNU();
		try {
			item.setId(ob.getNewOfficeId());
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
			OfficeAndryukhinNU of = (OfficeAndryukhinNU)o;
			if (!isNew)
				
				try {
					ob.deleteOffice(of.getId());
				} 
				catch (RemoteException ex) {
					ex.printStackTrace();
				}
			
			items.remove(of);
		}
		
		isSelected = false;
	}
	
	@Override
	public void edit(RowEditEvent e) {
		
		OfficeAndryukhinNU o = (OfficeAndryukhinNU)e.getObject();
		
		try 
		{	
			if (isNew)
			{ 
				ob.addOffice(o);			
				isNew = false;
			}
			else
				ob.updateOffice(o);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	}

}
