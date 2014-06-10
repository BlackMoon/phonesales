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
@Entity(name="Manufactor")
@Table(name="manufactors")
@NamedQuery(name = "Manufactor.getAll", query = "SELECT m from Manufactor m")
@XmlType(namespace="http://manufactor.org")
public class Manufactor_AndryukhinNU implements Key_AndryukhinNU {
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	private String country;	
	
	private List<Phone_AndryukhinNU> phones;
	
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
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="manufactor", cascade = CascadeType.ALL, orphanRemoval=true)	
	@XmlTransient
	public List<Phone_AndryukhinNU> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone_AndryukhinNU> phones) {
		this.phones = phones;
	}
	
	public void addPhone(Phone_AndryukhinNU p) {
		if (!phones.contains(p)) {
			phones.add(p);
		}
	}
	
	public void removePhone(Phone_AndryukhinNU p) {
		phones.remove(p);
	}


}
