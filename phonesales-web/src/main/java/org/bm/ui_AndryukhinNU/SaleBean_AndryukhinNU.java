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

import org.bm.service.office.OfficeAndryukhinNU;
import org.bm.service.phone.PhoneAndryukhinNU;
import org.bm.service.sale.SaleAndryukhinNU;
import org.icefaces.ace.component.celleditor.CellEditor;
import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;
import org.icefaces.ace.model.table.RowState;
import org.bm.service.sale.SaleServiceBean_AndryukhinNU;
import org.bm.service.sale.SaleServiceBean_AndryukhinNUServiceLocator;

/**
 * @author Black Moon
 *
 */
@ManagedBean(name="saleBean")
@ViewScoped
public class SaleBean_AndryukhinNU extends GridBean_AndryukhinNU<SaleAndryukhinNU> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SELECTOR = "form2:gridSales";
	private static final String ADDRESS = "http://localhost:8080/SaleServiceBean_AndryukhinNUService/SaleServiceBean_AndryukhinNU?wsdl";
	
	SaleServiceBean_AndryukhinNU sb;	
	
	@ManagedProperty(value="#{officeBean}")
	private OfficeBean_AndryukhinNU officeBean;
	
	@ManagedProperty(value="#{phoneBean}")
	private PhoneBean_AndryukhinNU phoneBean;
	
	public OfficeBean_AndryukhinNU getOfficeBean() {
		return officeBean;
	}

	public void setOfficeBean(OfficeBean_AndryukhinNU officeBean) {
		this.officeBean = officeBean;
	}

	public PhoneBean_AndryukhinNU getPhoneBean() {
		return phoneBean;
	}

	public void setPhoneBean(PhoneBean_AndryukhinNU phoneBean) {
		this.phoneBean = phoneBean;
	}

	@PostConstruct
    public void init() {
		try {
			sb = new SaleServiceBean_AndryukhinNUServiceLocator().getSale(new java.net.URL(ADDRESS));
			
			items = new ArrayList<SaleAndryukhinNU>();
			for (SaleAndryukhinNU s: sb.getAllSales())
			{
				items.add(s);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void add() {
		SaleAndryukhinNU item = new SaleAndryukhinNU();
		items.add(item);
		 		
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
			SaleAndryukhinNU s = (SaleAndryukhinNU)o;
			if (!isNew)
				
				try {
					sb.deleteSale(s.getId());
				} 
				catch (RemoteException ex) {
					ex.printStackTrace();
				}
			
			items.remove(s);
		}
		
		isSelected = false;
	}

	
	@Override
	public void edit(RowEditEvent e) {
		SaleAndryukhinNU s = (SaleAndryukhinNU)e.getObject();
		
		try
		{				
			s.setOffice(officeBean.get(s.getOfficeid()));
			s.setPhone(phoneBean.get(s.getPhoneid()));
			
			if (isNew)
			{ 
				sb.addSale(s);			
				isNew = false;
			}
			else
				sb.updateSale(s);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
		
	}

}
