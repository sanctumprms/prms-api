package org.rvsystem.hms.inventory.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.employe.entity.Employe;
import org.rvsystem.hms.organization.entity.Organization;
import org.rvsystem.hms.rateplan.entity.RatePlan;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="INVENTORY")
public class Inventory {

	@Id
	@SequenceGenerator(name = "INVENTORY_ID", sequenceName = "INVENTORY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVENTORY_ID")
	@Column(name = "INVENTORY_ID", unique = true, nullable = false)
	private int inventoryid;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "STATUS")
	private boolean status;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "PEOPLE")
	private int people;
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="RATEPLAN_INVENTORY", 
                joinColumns={@JoinColumn(name="INVENTORY_ID")}, 
                inverseJoinColumns={@JoinColumn(name="RATEPLAN_ID")})
	
	private Set<RatePlan> rateplans;
	
	public Set<RatePlan> getRateplans() {
		return rateplans;
	}

	public void setRateplans(Set<RatePlan> rateplans) {
		this.rateplans = rateplans;
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="inventory")
	private Set<Room> room;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORG_ID",nullable=false)
	private Organization organization;



	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="inventory")
	private Set<InventoryImage> inventoryimage;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;

	public int getInventoryid() {
		return inventoryid;
	}

	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public Set<Room> getRoom() {
		return room;
	}

	public void setRoom(Set<Room> room) {
		this.room = room;
	}

	public Set<InventoryImage> getInventoryimage() {
		return inventoryimage;
	}

	public void setInventoryimage(Set<InventoryImage> inventoryimage) {
		this.inventoryimage = inventoryimage;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	@Override
	public String toString() {
		return "Inventory [inventoryid=" + inventoryid + ", description="
				+ description + ", category=" + category + ", status=" + status
				+ ", price=" + price + ", name=" + name + ", people=" + people
				+ ", room=" + room + ", inventoryimage=" + inventoryimage
				+ ", employe=" + employe + ", organization=" + organization + ", rateplans=" + rateplans + "]";
	}
	
	
	
	
}
