package org.rvsystem.hms.item.entity;

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
@Table(name="ITEM_IMAGE")
public class ItemImage {

	@Id
	@SequenceGenerator(name = "ITEM_IMAGE_ID", sequenceName = "ITEM_IMAGE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_IMAGE_ID")
	@Column(name = "ITEM_IMAGE_ID", unique = true, nullable = false)
	private int itemimageid;
	
	@Column(name="NAME")
	private String name;
	
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ITEM_ID",nullable=false)
	private Item item;

	public int getItemimageid() {
		return itemimageid;
	}

	public void setItemimageid(int itemimageid) {
		this.itemimageid = itemimageid;
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemImage [itemimageid=" + itemimageid + ", name=" + name
				+ ", image=" + Arrays.toString(image) + ", item=" + item + "]";
	}
	

}
