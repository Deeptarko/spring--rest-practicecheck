package com.cognizant.truyum.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public class MenuItemDaoCollectionImpl implements MenuItemDao {
	
	private static List<MenuItem> menuItemList=new ArrayList<MenuItem>(List.of(
			new MenuItem(1L,"Pen",1000.98f,new Date(System.currentTimeMillis()),"Stationery",false),
			new MenuItem(2L,"Mobile",100000.98f,new Date(System.currentTimeMillis()),"Stationery",false)
	));
	
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		
		return menuItemList;
	}

	@Override
	public MenuItem getMenuItem(Long id) {
		
		MenuItem menuItem=menuItemList.stream().filter((item)->item.getId()==id).findFirst().orElse(null);
		return menuItem;
	}

}
