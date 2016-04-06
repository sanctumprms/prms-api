package org.rvsystem.hms.item.entity;


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



@Entity
@Table(name="ITEM")
public class Item {

	@Id
	@SequenceGenerator(name = "ITEM_ID", sequenceName = "ITEM_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_ID")
	@Column(name = "ITEM_ID", unique = true, nullable = false)
	private int itemid;
	
	@Column(name="ITEM_NAME")
	private String itemname;
	
	@Column(name="ITEM_DESCRIPTION")
	private String itemdescription;
	
	@Column(name="PRICE")
	private double price;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROPERTY_ID",nullable=false)
	private Property property;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemdescription() {
		return itemdescription;
	}

	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	
	
	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}


	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname
				+ ", itemdescription=" + itemdescription + ", price=" + price
				+ ", employe=" + employe +  ", property=" + property + "]";
	}
	

}
