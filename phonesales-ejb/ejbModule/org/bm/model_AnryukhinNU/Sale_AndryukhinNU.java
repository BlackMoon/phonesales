/**
 * 
 */
package org.bm.model_AnryukhinNU;

import java.util.Date;

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
import javax.xml.bind.annotation.XmlType;

/**
 * @author Black Moon
 *
 */
@Entity(name="Sale")
@Table(name="sales")
@NamedQuery(name = "Sale.getAll", query = "SELECT s from Sale s")
@XmlType(namespace="http://sale.org")
public class Sale_AndryukhinNU implements Key_AndryukhinNU {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int officeid;
	private int phoneid;
	
	private float price;
	
	private Date saleDate;
	
	private Phone_AndryukhinNU phone;
	private Office_AndryukhinNU office;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Transient
	public int getOfficeid() {
		return officeid;
	}

	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	
	@Transient
	public int getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="phoneid")
	public Phone_AndryukhinNU getPhone() {
		return phone;
	}
	
	public void setPhone(Phone_AndryukhinNU phone) {
		this.phone = phone;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="officeid")
	public Office_AndryukhinNU getOffice() {
		return office;
	}

	public void setOffice(Office_AndryukhinNU office) {
		this.office = office;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
