package org.rvsystem.hms.employe.entity;

import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EDUCATION")
public class Education {

	@Id
	@SequenceGenerator(name = "EDUCATION_ID", sequenceName = "EDUCATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EDUCATION_ID")
	@Column(name = "EDUCATION_ID", unique = true, nullable = false)
	private int educationid;
	
	@Column(name = "DEGREE")
	private String degree;
	
	@Column(name = "UNIVERSITY")
	private String university;
	
	@Lob
	@Basic(fetch=FetchType.LAZY) 
	private byte[] image;

	public int getEducationid() {
		return educationid;
	}

	public void setEducationid(int educationid) {
		this.educationid = educationid;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Education [educationid=" + educationid + ", degree=" + degree
				+ ", university=" + university + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
}
