package org.rvsystem.hms.site.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SITE")

public class Site {
	@Id
	@SequenceGenerator(name = "SITE_ID", sequenceName = "ITEM_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SITE_ID")
	@Column(name = "SITE_ID", unique = true, nullable = false)
	private int siteid;
	
	@Column(name = "SITE_NAME", unique = true, nullable = false)
	private String siteName;
	
	
	public int getSiteid() {
		return siteid;
	}
	public void setSiteid(int siteid) {
		this.siteid = siteid;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
	@Override
	public String toString() {
		return "Site [siteid =" + siteid + ", siteName="
				+ siteName + "]";
	}
	
	
}
