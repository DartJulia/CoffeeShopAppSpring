package com.coffeeapp.CoffeeShopApp.entity;

public class Items {

	private String name;
	private String description;
	private int quantity;
	private double price;

	public Items() {
		name = "";
		description = "";
		quantity = 0;
		price = 0.0;
	}

	public Items(String name, String description, int quantity, double price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price;
	}

}
