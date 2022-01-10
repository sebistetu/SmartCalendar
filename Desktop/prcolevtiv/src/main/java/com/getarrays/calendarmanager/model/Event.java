package com.getarrays.calendarmanager.model;

import java.sql.Time;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Date startDate;
	private Date endDate;
	private Time startTime;
	private Time endTime;
	private String description;
	private String category;
	private Long importance;
	
	
	Event(Long id, Date startDate, Date endDate, Time startTime, Time endTime,
			String description, String category, Long importance) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
		this.category = category;
		this.importance = importance;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Time getStartTime() {
		return startTime;
	}


	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}


	public Time getEndTime() {
		return endTime;
	}


	public void setEndTime(Time endTime) {
		this.endTime = endTime;
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


	public Long getImportance() {
		return importance;
	}


	public void setImportance(Long importance) {
		this.importance = importance;
	}
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", description=" + description + ", category=" + category + ", importance="
				+ importance + "]";
	}

	
	
}
