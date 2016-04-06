package org.rvsystem.hms.property.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.employe.entity.Employe;
import org.rvsystem.hms.organization.entity.Organization;

@Entity
@Table(name="PROPERTY")
public class Property {

	@Id
	@SequenceGenerator(name = "PROPERTY_ID", sequenceName = "PROPERTY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROPERTY_ID")
	@Column(name = "PROPERTY_ID", unique = true, nullable = false)
	private int property_id;
	@Column(name = "PROPERTY_NAME", unique = true, nullable = false)	
	private String property_name;
	@Column(name = "PROPERTY_DESCRIPTION", unique = true, nullable = false)
	private String property_description;
	@Column(name = "ADDRESS", unique = true, nullable = false)
	private String address;
	@Column(name = "PINCODE", unique = true, nullable = false)
	private int pincode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORG_ID",nullable=false)
	private Organization organization;


	public int getProperty_id() {
		return property_id;
	}
	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}
	public String getProperty_name() {
		return property_name;
	}
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}
	public String getProperty_description() {
		return property_description;
	}
	public void setProperty_description(String property_description) {
		this.property_description = property_description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "Property [property_id=" + property_id + ", property_name="
				+ property_name + ", property_description=" + property_description 
				+ ", address=" + address + ", pincode=" + pincode 
				+ ", employe=" + employe + ", organization=" + organization + "]";
	}
	

}
