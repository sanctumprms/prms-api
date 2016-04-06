package org.rvsystem.hms.inventory.entity;

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
import org.rvsystem.hms.property.entity.Property;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="ROOM")
public class Room {
	
	@Id
	@SequenceGenerator(name = "ROOM_ID", sequenceName = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROOM_ID")
	@Column(name = "ROOM_ID", unique = true, nullable = false)
	private int roomid;
	
	@Column(name = "ROOM_NO")
	private int roomno;
	
	@Column(name = "STATUS")
	private boolean status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="INVENTORY_ID",nullable=false)
	private Inventory inventory;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROPERTY_ID",nullable=false)
	private Property property;
	
	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
	
	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomno=" + roomno + ", status="
				+ status + ", employe=" + employe + ", inventory=" + inventory +
				", property=" + property+ "]";
	}


	
}
