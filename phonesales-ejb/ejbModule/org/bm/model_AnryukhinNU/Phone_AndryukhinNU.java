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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Black Moon
 *
 */
@Entity(name="Phone")
@Table(name="phones")
@NamedQuery(name = "Phone.getAll", query = "SELECT p from Phone p")
@XmlType(namespace="http://phone.org")
public class Phone_AndryukhinNU implements Key_AndryukhinNU {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int manufactorid;
	private int year;
	
	private String model;
	
	private Manufactor_AndryukhinNU manufactor;
	private List<Sale_AndryukhinNU> sales;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="manufactorid", referencedColumnName="id")
	public Manufactor_AndryukhinNU getManufactor() {
		return manufactor;
	}

	public void setManufactor(Manufactor_AndryukhinNU manufactor) {
		this.manufactor = manufactor;
		
		if (manufactor != null)
			manufactorid = manufactor.getId();

	}
	
	@Transient
	public int getManufactorid() {
		return manufactorid;
	}

	public void setManufactorid(int manufactorid) {
		this.manufactorid = manufactorid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy="phone", cascade = CascadeType.ALL, orphanRemoval=true)
	@XmlTransient
	public List<Sale_AndryukhinNU> getSales() {
		return sales;
	}

	public void setSales(List<Sale_AndryukhinNU> sales) {
		this.sales = sales;
	}
	
	
	
}
