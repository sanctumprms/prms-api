package org.rvsystem.hms.employe.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="EMPLOYE_IDENTIFICATION")
public class EmployeIdentification {

	@Id
	@SequenceGenerator(name = "EMPLOYE_IDENTIFICATION_ID", sequenceName = "EMPLOYE_IDENTIFICATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYE_IDENTIFICATION_ID")
	@Column(name = "EMPLOYE_IDENTIFICATION_ID", unique = true, nullable = false)
	private int employeidentificationid;
	
	@Column(name = "EMPLOYE_IDENTIFICATION_NAME")
	private int employeidentificationname;
	
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;

	public int getEmployeidentificationid() {
		return employeidentificationid;
	}

	public void setEmployeidentificationid(int employeidentificationid) {
		this.employeidentificationid = employeidentificationid;
	}

	public int getEmployeidentificationname() {
		return employeidentificationname;
	}

	public void setEmployeidentificationname(int employeidentificationname) {
		this.employeidentificationname = employeidentificationname;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "EmployeIdentification [employeidentificationid="
				+ employeidentificationid + ", employeidentificationname="
				+ employeidentificationname + ", image="
				+ Arrays.toString(image) + ", employe=" + employe + "]";
	}
	
	
	
}
