package org.rvsystem.hms.address.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.customer.entity.Customer;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CUSTOMER_ADDRESS")
public class CustomerAddress {

	@Id
	@SequenceGenerator(name = "CUSTOMER_ADDRESS_ID", sequenceName = "CUSTOMER_ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_ADDRESS_ID")
	@Column(name = "CUSTOMER_ADDRESS_ID", unique = true, nullable = false)
	private int customeraddressid;
	
	@Column(name = "APT_NO")
	private int aptno;
	
	@Column(name = "STREET_NAME1")
	private String streetname1;
	
	@Column(name = "STREET_NAME2")
	private String streetname2;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "ZIPCODE")
	private int zipcode;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CUSTOMER_ID",nullable=false)
	private Customer customer;

	public int getCustomeraddressid() {
		return customeraddressid;
	}

	public void setCustomeraddressid(int customeraddressid) {
		this.customeraddressid = customeraddressid;
	}

	public int getAptno() {
		return aptno;
	}

	public void setAptno(int aptno) {
		this.aptno = aptno;
	}

	public String getStreetname1() {
		return streetname1;
	}

	public void setStreetname1(String streetname1) {
		this.streetname1 = streetname1;
	}

	public String getStreetname2() {
		return streetname2;
	}

	public void setStreetname2(String streetname2) {
		this.streetname2 = streetname2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerAddress [customeraddressid=" + customeraddressid
				+ ", aptno=" + aptno + ", streetname1=" + streetname1
				+ ", streetname2=" + streetname2 + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", zipcode="
				+ zipcode + "]";
	}
	
	
	
}
