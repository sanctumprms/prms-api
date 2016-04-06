package org.rvsystem.hms.customer.request;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("HMS/customer")
public class CustomerRequest {

	private Integer customerid;
	
	private String firstname;
	
	private String lastname;
	
	private String username;
	
	private String password;
	
	private String emailid;
	
	private String contactnumber;

	private boolean active;
	
	
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

	@Override
	public String toString() {
		return "CustomerRequest [customerid=" + customerid + ", firstname="
				+ firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", emailid=" + emailid
				+ ", contactnumber=" + contactnumber + ", active=" + active
				+  "]";
	}

	
	
	
}
