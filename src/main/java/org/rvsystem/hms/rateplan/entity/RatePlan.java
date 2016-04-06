package org.rvsystem.hms.rateplan.entity;

import java.util.Date;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.rvsystem.hms.inventory.entity.Inventory;
import org.rvsystem.hms.property.entity.Property;

@Entity
@Table(name="RATEPLAN")
public class RatePlan {
	
	@Id
	@SequenceGenerator(name = "RATEPLAN_ID", sequenceName = "RATEPLAN_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RATEPLAN_ID")
	@Column(name = "RATEPLAN_ID", unique = true, nullable = false)
	private int ratePlanId;
	
	@Column(name = "PRIORITY", nullable = false)
	private int priority;
	
	@Column(name = "STARTDATE", nullable = false)
	private Date startDate;
	
	@Column(name = "ENDDATE", nullable = false)
	private Date endDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROPERTY_ID",nullable=false)
	private Property property;
	
	
	public int getRatePlanId() {
		return ratePlanId;
	}
	public void setRatePlanId(int ratePlanId) {
		this.ratePlanId = ratePlanId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "RatePlan [ratePlanId=" + ratePlanId + ", priority=" + priority
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", property=" + property + "]";
	}

	

}
