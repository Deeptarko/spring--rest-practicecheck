package com.cognizant.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	//Add to cart
	@PostMapping("/{userId}/{menuItemId}")
	public String addCartItem(@PathVariable String userId,@PathVariable long menuItemId) {
		return cartService.addCartItem(userId,menuItemId);
	}
	
	//Get All Cart Items
	@GetMapping("/{userId}")
	public List<MenuItem> getAllCartItems(@PathVariable String userId) throws CartEmptyException {
		return cartService.getAllCartItems(userId);
	}
	
	//Delete Cart Items
	@DeleteMapping("/{userId}/{menuItemId}")
	public String deleteCartItems(@PathVariable String userId,@PathVariable long menuItemId) {
		return cartService.deleteCartItems(userId, menuItemId);
	}
}
