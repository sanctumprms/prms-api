package org.rvsystem.hms.item.entity;

import java.util.Date;

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

import org.rvsystem.hms.bill.entity.Bill;
import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.employe.entity.Employe;


@Entity
@Table(name = "ITEMTRANSACTION")
public class ItemTransaction {

	@Id
	@SequenceGenerator(name = "ITEM_TRANSACTION_ID", sequenceName = "ITEM_TRANSACTION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_TRANSACTION_ID")
	@Column(name = "ITEM_TRANSACTION_ID", unique = true, nullable = false)
	private int ItemTransactionid;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "RATE")
	private double rate;
	
	@Column(name = "TRANSACTIONDETAIL")
	private String transactiondetail;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "CREATION_DATE")
	private Date creationdate;
	
	@Column(name = "amount")
	private double amount;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ITEM_ID",nullable=false)
	private Customer item;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID",nullable=false)
	private Customer customer;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BILL_ID",nullable=false)
	private Bill bill;

	public int getItemTransactionid() {
		return ItemTransactionid;
	}

	public void setItemTransactionid(int itemTransactionid) {
		ItemTransactionid = itemTransactionid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTransactiondetail() {
		return transactiondetail;
	}

	public void setTransactiondetail(String transactiondetail) {
		this.transactiondetail = transactiondetail;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getItem() {
		return item;
	}

	public void setItem(Customer item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "ItemTransaction [ItemTransactionid=" + ItemTransactionid
				+ ", status=" + status + ", rate=" + rate
				+ ", transactiondetail=" + transactiondetail + ", quantity="
				+ quantity + ", creationdate=" + creationdate + ", amount="
				+ amount + ", item=" + item + ", customer=" + customer
				+ ", employe=" + employe + ", bill=" + bill + "]";
	}



}
