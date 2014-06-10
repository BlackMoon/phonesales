/**
 * 
 */
package org.bm.model_AnryukhinNU;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
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
	
	private String name;
	
	private Manufactor_AndryukhinNU manufactor;
	private Sale_AndryukhinNU sale;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="phone", cascade = CascadeType.ALL, orphanRemoval=true)
	@XmlTransient
	public Sale_AndryukhinNU getSale() {
		return sale;
	}

	public void setSale(Sale_AndryukhinNU sale) {
		this.sale = sale;
	}
	
	@Transient
	public int getManufactorid() {
		return manufactorid;
	}

	public void setManufactorid(int manufactorid) {
		this.manufactorid = manufactorid;
	}
	
	
	
}
