package com.abdul.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private User user;
	private List<Product> products;
	private double totalAmt;
	private String status;
	private LocalDateTime createdAt, updatedAt;

	public Order() {
	}

	public Order(User user, double totalAmt, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.user = user;
		this.products = new ArrayList<>();
		this.totalAmt = totalAmt;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
