package org.rvsystem.hms.employe.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.address.entity.EmployeAddress;
import org.rvsystem.hms.bill.entity.Bill;
import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.inventory.entity.Inventory;
import org.rvsystem.hms.inventory.entity.Room;
import org.rvsystem.hms.item.entity.Item;
import org.rvsystem.hms.item.entity.ItemTransaction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EMPLOYE")
public class Employe {

	

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYE_ID")
	@SequenceGenerator(name = "EMPLOYE_ID", sequenceName = "EMPLOYE_ID")
	@Column(name = "EMPLOYE_ID", unique = true, nullable = false)
	private Integer employeid;

	@Column(name = "FIRSTNAME")
	private String firstname;

	
	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "USERNAME", unique = true, nullable = false)
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL_ID", unique = true, nullable = false)
	private String emailid;

	@Column(name = "CONTACTNUMBER", unique = true, nullable = false)
	private String contactnumber;

	@Column(name = "ACTIVE")
	private boolean active;

	public Integer getEmployeid() {
		return employeid;
	}

	public void setEmployeid(Integer employeid) {
		this.employeid = employeid;
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

	@Override
	public String toString() {
		return "Employe [employeid=" + employeid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", emailid=" + emailid
				+ ", contactnumber=" + contactnumber + ", active=" + active
				+ "]";
	}

	
	
	

}
