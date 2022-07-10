package com.cognizant.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

	@Autowired
	private MenuItemService menuItemService;

	// Get All Menu Items
	@GetMapping()
	public List<MenuItem> getAllMenuItems() {
		return menuItemService.getMenuItemListCustomer();
	}

	// Get Menu Items By Id
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable Long id) {
		return menuItemService.getMenuItem(id);

	}

	// Save Menu Item
	@PutMapping()
	public String getMenuItem(@RequestBody MenuItem item) {
		return menuItemService.save(item);

	}

}
