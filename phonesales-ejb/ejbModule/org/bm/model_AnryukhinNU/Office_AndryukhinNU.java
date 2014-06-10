/**
 * 
 */
package org.bm.model_AnryukhinNU;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Black Moon
 *
 */
@Entity(name="Office")
@Table(name="offices")
@NamedQuery(name = "Office.getAll", query = "SELECT o from Office o")
@XmlType(namespace="http://office.org")
public class Office_AndryukhinNU implements Key_AndryukhinNU {
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	private String address;
	
	private List<Sale_AndryukhinNU> sales;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="office", cascade = CascadeType.ALL, orphanRemoval=true)
	@XmlTransient
	public List<Sale_AndryukhinNU> getSales() {
		return sales;
	}

	public void setSales(List<Sale_AndryukhinNU> sales) {
		this.sales = sales;
	}
	
	public void addSale(Sale_AndryukhinNU s) {
		if (!sales.contains(s)) {
			sales.add(s);
		}
	}
	
	public void removeSale(Sale_AndryukhinNU s) {
		sales.remove(s);
	}

}
