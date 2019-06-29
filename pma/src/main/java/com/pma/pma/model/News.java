package com.pma.pma.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "news")
public class News implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private Long identificator;
	
	@Column
	private String content;
	
	@Column
	private String title;
	
	@Column
	private byte[] image;
	
	@Column
	private Date dateAdded;

	@OneToMany
	private List<Restriction> restrictions;
	
	
	public Long getIdentificatior() {
		return identificator;
	}

	public void setIdentificatior(Long identificator) {
		this.identificator = identificator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public  List<Restriction> getRestriction() {
		return restrictions;
	}

	public void setRestriction( List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
