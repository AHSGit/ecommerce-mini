package com.abdul.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private int id;
	private User user;
	private List<Product> products;
	private double totalAmount;
	private LocalDateTime createdAt, updatedAt;
	private Map<Product, Integer> productQuantities;
	private boolean isActive;

	public Cart() {
	}

	public Cart(User user, double totalAmount, LocalDateTime createdAt, LocalDateTime updatedAt, boolean isActive) {
		this.user = user;
		this.products = new ArrayList<>();
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.productQuantities = new HashMap<>();
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Map<Product, Integer> getProductQuantities() {
		return productQuantities;
	}

	public void setProductQuantities(Map<Product, Integer> productQuantities) {
		this.productQuantities = productQuantities;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
