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

import org.bm.service.person.PersonAndryukhinNU;
import org.bm.service.person.PersonServiceBean_AndryukhinNU;
import org.bm.service.person.PersonServiceBean_AndryukhinNUServiceLocator;
import org.icefaces.ace.component.celleditor.CellEditor;
import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;
import org.icefaces.ace.model.table.RowState;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="personBean")
@ViewScoped
public class PersonBean_AndryukhinNU extends GridBean_AndryukhinNU<PersonAndryukhinNU> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridPersons"; 
	private static final String ADDRESS = "http://localhost:8080/PersonServiceBean_AndryukhinNUService/PersonServiceBean_AndryukhinNU?wsdl";
	
	PersonServiceBean_AndryukhinNU pb;
	
	@PostConstruct
    public void init() {
		try {
			pb = new PersonServiceBean_AndryukhinNUServiceLocator().getPerson(new java.net.URL(ADDRESS));
			
			items = new ArrayList<PersonAndryukhinNU>();
			for (PersonAndryukhinNU p: pb.getAllPersons())
			{
				items.add(p);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Override
	public void add(){
		
		PersonAndryukhinNU item = new PersonAndryukhinNU();
		try {
			item.setId(pb.getNewPersonId());
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
	public void edit(RowEditEvent e){
		PersonAndryukhinNU p = (PersonAndryukhinNU)e.getObject();
		
		try 
		{	
			if (isNew)
			{ 
				pb.addPerson(p);			
				isNew = false;
			}
			else
				pb.updatePerson(p);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	}

	@Override
	public void delete(ActionEvent e) {
		
		for (Object o : stateMap.getSelected())
		{
			PersonAndryukhinNU p = (PersonAndryukhinNU)o;
			if (!isNew)
				
				try {
					pb.deletePerson(p.getId());
				} 
				catch (RemoteException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			
			items.remove(p);
		}
		
		isSelected = false;
	}
	
	// for UserDetailsService
	public PersonAndryukhinNU get(String username) throws RemoteException {
		return pb.getByLogin(username);
	}


}
