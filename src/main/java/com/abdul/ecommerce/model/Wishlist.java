package com.abdul.ecommerce.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Wishlist {

	private int id;
	private User user;
	private Set<Product> products;
	private LocalDateTime createdAt, updatedAt;
	private String listName;

	public Wishlist() {
	}

	public Wishlist(User user, LocalDateTime createdAt, LocalDateTime updatedAt, String listName) {
		this.user = user;
		this.listName = listName;
		this.products = new HashSet<>();
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

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
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

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

}
