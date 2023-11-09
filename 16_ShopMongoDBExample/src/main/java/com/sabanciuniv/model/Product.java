package com.sabanciuniv.model;

public class Product {


	private String id;
	private String name;
	private int stock;
	private double price;
	

	private Supplier supplier;
	
	public Product(String name, int stock, double price, Supplier supplier) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.supplier = supplier;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + ", supplier="
				+ supplier + "]";
	}
	
	
	
}
