package org.rvsystem.hms.reservation.entity;

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

import org.rvsystem.hms.bill.entity.Bill;
import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.employe.entity.Employe;
import org.rvsystem.hms.inventory.entity.Room;
import org.rvsystem.hms.property.entity.Property;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="RESERVATION")
public class Reservation {

	@Id
	@SequenceGenerator(name = "RESERVATION_ID", sequenceName = "RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESERVATION_ID")
	@Column(name = "RESERVATION_ID", unique = true, nullable = false)
	private int reservationid;
	
	@Column(name = "CREATION_DATE")
	private Date creationdate;
	
	@Column(name = "START_DATE")
	private Date startdate;
	
	@Column(name = "END_DATE")
	private Date enddate;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "TYPE")
	private String type;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="reservation")
	private Set<Bill> bill;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID",nullable=false)
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ROOM_ID",nullable=false)
	private Room room;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROPERTY_ID",nullable=false)
	private Property property;


	public int getReservationid() {
		return reservationid;
	}

	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<Bill> getBill() {
		return bill;
	}

	public void setBill(Set<Bill> bill) {
		this.bill = bill;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Reservation [reservationid=" + reservationid
				+ ", creationdate=" + creationdate + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", status=" + status + ", type="
				+ type + ", bill=" + bill + ", customer=" + customer
				+ ", employe=" + employe + ", room=" + room + ", property=" + property + "]";
	}
	
	
	

}
