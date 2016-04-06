package org.rvsystem.hms.reservation.entity;

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


@Entity
@Table(name="RESERVATION_TRANSACTION")
public class ReservationTransaction {

	@Id
	@SequenceGenerator(name = "RESERVATION_TRANSACTION_ID", sequenceName = "RESERVATION_TRANSACTION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESERVATION_TRANSACTION_ID")
	@Column(name = "RESERVATION_TRANSACTION_ID", unique = true, nullable = false)
	private int reservationtransactionid;
	
	@Column(name = "BANK_TRANSACTION_ID")
	private int banktransactionid;
	
	@Column(name = "MODE")
	private String mode;
	
	@Column(name = "DAYS")
	private Date day;
	
	@Column(name = "AMOUNT")
	private double amount;
	
	@Column(name = "STATUS")
	private String status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESERVATION_ID",nullable=false)
	private Reservation reservation;

	public int getReservationtransactionid() {
		return reservationtransactionid;
	}

	public void setReservationtransactionid(int reservationtransactionid) {
		this.reservationtransactionid = reservationtransactionid;
	}

	public int getBanktransactionid() {
		return banktransactionid;
	}

	public void setBanktransactionid(int banktransactionid) {
		this.banktransactionid = banktransactionid;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "ReservationTransaction [reservationtransactionid="
				+ reservationtransactionid + ", banktransactionid="
				+ banktransactionid + ", mode=" + mode + ", day=" + day
				+ ", amount=" + amount + ", status=" + status
				+ ", reservation=" + reservation + "]";
	}
	
	

}
