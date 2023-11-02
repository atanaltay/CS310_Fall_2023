package com.example;

//Product Entity
public class Product {
	
	private int id;
	private String name;
	private int stock;
	private double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id,String name, int stock, double price) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + "]";
	}
	
	

}
