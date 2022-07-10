package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public interface CartDao {
	public String addCartItem(String userId, long menuItemId);

	public List<MenuItem> getAllCartItems(String userId) throws CartEmptyException;

	public void removeCartItem(String userId, long menuItemId);
	
	
}
