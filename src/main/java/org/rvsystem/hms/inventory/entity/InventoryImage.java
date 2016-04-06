package org.rvsystem.hms.inventory.entity;

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

@Entity
@Table(name="INVENTORY_IMAGE")
public class InventoryImage {

	@Id
	@SequenceGenerator(name = "INVENTORY_IMAGE_ID", sequenceName = "INVENTORY_IMAGE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVENTORY_IMAGE_ID")
	@Column(name = "INVENTORY_IMAGE_ID", unique = true, nullable = false)
	private int inventoryimageid;
	
	@Column(name="NAME")
	private String name;
	
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="INVENTORY_ID",nullable=false)
	private Inventory inventory;

	@Override
	public String toString() {
		return "InventoryImage [inventoryimageid=" + inventoryimageid
				+ ", name=" + name + ", image=" + Arrays.toString(image)
				+ ", inventory=" + inventory + "]";
	}

	public int getInventoryimageid() {
		return inventoryimageid;
	}

	public void setInventoryimageid(int inventoryimageid) {
		this.inventoryimageid = inventoryimageid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	


}
