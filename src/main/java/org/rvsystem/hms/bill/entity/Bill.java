package org.rvsystem.hms.bill.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.employe.entity.Employe;
import org.rvsystem.hms.item.entity.ItemTransaction;
import org.rvsystem.hms.property.entity.Property;
import org.rvsystem.hms.reservation.entity.Reservation;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="BILL")
public class Bill {

	@Id
	@SequenceGenerator(name = "BILL_ID", sequenceName = "BILL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BILL_ID")
	@Column(name = "BILL_ID", unique = true, nullable = false)
	private int billid;
	
	@Column(name = "BILL_NO")
	private String billno;
	
	@Column(name = "CREATION_DATE")
	private Date creationdate;
	
	@Column(name = "COMPLETION_DATE")
	private Date completiondate;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="bill")
	private Set<ItemTransaction> itemTransaction;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESERVATION_ID",nullable=false)
	private Reservation reservation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID",nullable=false)
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROPERTY_ID",nullable=false)
	private Property property;
	
	
	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public Date getCompletiondate() {
		return completiondate;
	}

	public void setCompletiondate(Date completiondate) {
		this.completiondate = completiondate;
	}

	public Set<ItemTransaction> getItemTransaction() {
		return itemTransaction;
	}

	public void setItemTransaction(Set<ItemTransaction> itemTransaction) {
		this.itemTransaction = itemTransaction;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", billno=" + billno
				+ ", creationdate=" + creationdate + ", completiondate="
				+ completiondate + ", itemTransaction=" + itemTransaction
				+ ", reservation=" + reservation + ", employe=" + employe
				+ ", customer=" + customer + ", property=" + property + "]";
	}

	
	
	
}
