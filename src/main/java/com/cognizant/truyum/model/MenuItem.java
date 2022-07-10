package com.cognizant.truyum.model;

import java.sql.Date;

public class MenuItem {
	private Long id;
	private String name;
	private float price;
	private Date dateOfLaunch;
	private String category;
	private boolean freeCategory;

	public MenuItem() {

	}

	public MenuItem(Long id, String name, float price, Date dateOfLaunch, String category, boolean freeCategory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeCategory = freeCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreeCategory() {
		return freeCategory;
	}

	public void setFreeCategory(boolean freeCategory) {
		this.freeCategory = freeCategory;
	}
}
