package org.rvsystem.hms.customer.entity;

import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="CUSTOMER_IDENTIFICATION")
public class CustomerIdentification {

	@Id
	@SequenceGenerator(name = "CUSTOMER_IDENTIFICATION_ID", sequenceName = "CUSTOMER_IDENTIFICATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_IDENTIFICATION_ID")
	@Column(name = "CUSTOMER_IDENTIFICATION_ID", unique = true, nullable = false)
	private int customeridentificationid;
	
	@Column(name = "CUSTOMER_IDENTIFICATION_NAME")
	private String customeridentificationname;
	
	
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID",nullable=false)
	private Customer customer;

	public int getCustomeridentificationid() {
		return customeridentificationid;
	}

	public void setCustomeridentificationid(int customeridentificationid) {
		this.customeridentificationid = customeridentificationid;
	}

	public String getCustomeridentificationname() {
		return customeridentificationname;
	}

	public void setCustomeridentificationname(String customeridentificationname) {
		this.customeridentificationname = customeridentificationname;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerIdentification [customeridentificationid="
				+ customeridentificationid + ", customeridentificationname="
				+ customeridentificationname + ", image="
				+ Arrays.toString(image) + ", customer=" + customer + "]";
	}
	
	
	
	
}
