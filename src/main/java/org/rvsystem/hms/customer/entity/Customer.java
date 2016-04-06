package org.rvsystem.hms.customer.entity;

import java.util.Arrays;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.address.entity.CustomerAddress;
import org.rvsystem.hms.bill.entity.Bill;
import org.rvsystem.hms.employe.entity.Employe;
import org.rvsystem.hms.item.entity.ItemTransaction;
import org.rvsystem.hms.reservation.entity.Reservation;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@SequenceGenerator(name = "CUSTOMER_ID", sequenceName = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_ID")
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false)
	private Integer customerid;
	
	@Column(name="FIRSTNAME", unique = true, nullable = false)
	private String firstname;
	
	@Column(name="LASTNAME", unique = true, nullable = false)
	private String lastname;
	
	@Column(name="USERNAME", unique = true, nullable = false)
	private String username;
	
	@Column(name="PASSWORD", nullable = false)
	private String password;
	
	@Column(name="EMAIL_ID", unique = true, nullable = false)
	private String emailid;
	
	@Column(name="CONTACTNUMBER", unique = true, nullable = false)
	private String contactnumber;

	@Column(name = "ACTIVE")
	private boolean active;
	
	@JsonIgnore
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customer")
	private Set<Reservation> reservation;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customer")
	private Set<CustomerIdentification> customeridentification;

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customer")
	private Set<ItemTransaction> itemTransaction;

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customer")
	private Set<Bill> bill;

	@JsonIgnore
	@OneToOne(mappedBy="customer",fetch=FetchType.EAGER)
	private CustomerAddress customeraddress;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=true)
	private Employe employe;

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Set<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Set<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Set<CustomerIdentification> getCustomeridentification() {
		return customeridentification;
	}

	public void setCustomeridentification(
			Set<CustomerIdentification> customeridentification) {
		this.customeridentification = customeridentification;
	}

	public Set<ItemTransaction> getItemTransaction() {
		return itemTransaction;
	}

	public void setItemTransaction(Set<ItemTransaction> itemTransaction) {
		this.itemTransaction = itemTransaction;
	}

	public Set<Bill> getBill() {
		return bill;
	}

	public void setBill(Set<Bill> bill) {
		this.bill = bill;
	}

	public CustomerAddress getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(CustomerAddress customeraddress) {
		this.customeraddress = customeraddress;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname="
				+ firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", emailid=" + emailid
				+ ", contactnumber=" + contactnumber + ", active=" + active
				+ ", image=" + Arrays.toString(image) + ", customeridentification="
				+ customeridentification + ", customeraddress="
				+ customeraddress + ", employe=" + employe + "]";
	}
	
	
	
}
