package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemDao {
	
	public List<MenuItem> getMenuItemListCustomer();
	public MenuItem getMenuItem(Long id);
}
