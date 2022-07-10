package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemDao menuItemDao;
	
	public List<MenuItem>getMenuItemListCustomer(){
		return menuItemDao.getMenuItemListCustomer();
	}
	public MenuItem getMenuItem(Long id) {
		return menuItemDao.getMenuItem(id);
	}
	
	public String save(MenuItem item) {
		return menuItemDao.save(item);
	}
	
	

}
