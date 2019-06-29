package com.pma.pma.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "restriction")
public class Restriction implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private Date fromDate;
	
	@Column
	private Date toDate;
	
	@Column
	private double latFrom;
	
	@Column
	private double lonFrom;
	
	@Column
	private double latTo;
	
	@Column
	private double lonTo;

	@ManyToOne
	
	private News news;
	
	@Column
	private RestrictionType restrictionType;
	
	public Long getId() {
		return id;
	}
	
	

	public Date getFromDate() {
		return fromDate;
	}



	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}



	public Date getToDate() {
		return toDate;
	}



	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}



	public double getLatFrom() {
		return latFrom;
	}



	public void setLatFrom(double latFrom) {
		this.latFrom = latFrom;
	}



	public double getLonFrom() {
		return lonFrom;
	}



	public void setLonFrom(double lonFrom) {
		this.lonFrom = lonFrom;
	}



	public double getLatTo() {
		return latTo;
	}



	public void setLatTo(double latTo) {
		this.latTo = latTo;
	}



	public double getLonTo() {
		return lonTo;
	}



	public void setLonTo(double lonTo) {
		this.lonTo = lonTo;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Date getFrom() {
		return fromDate;
	}

	public void setFrom(Date from) {
		this.fromDate = from;
	}

	public Date getTo() {
		return toDate;
	}

	public void setTo(Date to) {
		this.toDate = to;
	}

	
	@JsonIgnore
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public RestrictionType getRestrictionType() {
		return restrictionType;
	}

	public void setRestrictionType(RestrictionType restrictionType) {
		this.restrictionType = restrictionType;
	}
	
	

}
