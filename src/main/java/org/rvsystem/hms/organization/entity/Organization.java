package org.rvsystem.hms.organization.entity;

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
import org.rvsystem.hms.site.entity.Site;

@Entity
@Table(name="ORGANIZATION")

public class Organization {

	@Id
	@SequenceGenerator(name = "ORG_ID", sequenceName = "ORG_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_ID")
	@Column(name = "ORG_ID", unique = true, nullable = false)
	private int org_id;
	
	@Column(name = "ORG_NAME", unique = true, nullable = false)
	private String orgName;
	
	@Column(name = "DESCRIPTION", unique = true, nullable = false)
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYE_ID",nullable=false)
	private Employe employe;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SITE_ID",nullable=false)
	private Site site;
	
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}

	@Override
	public String toString() {
		return "Organization [org_id=" + org_id + ", orgName="
				+ orgName + ", description=" + description + ", employe=" + employe + ", site=" + site +"]";
	}
	

}
