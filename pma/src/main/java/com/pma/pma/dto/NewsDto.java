package com.pma.pma.dto;

import org.springframework.web.multipart.MultipartFile;

public class NewsDto {

	private String title;
	private String text;
	private MultipartFile image;
	
	
	
	public NewsDto() {
		super();
	}
	public NewsDto(String title, String text, MultipartFile image) {
		super();
		this.title = title;
		this.text = text;
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
}
