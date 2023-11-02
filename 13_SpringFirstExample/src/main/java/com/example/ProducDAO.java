package com.example;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ProducDAO {

	Logger logger = LoggerFactory.getLogger(ProducDAO.class);
	
	List<Product> prods = new ArrayList<>();
	
	//findAll()
	//findById(int id)
	//save(Product)
	//update(Product)
	//delete/remove(Product)
	
	//called after constructor call
	@PostConstruct
	public void init(){
		
		logger.info("DAO is initialized.");
		
		Product prod2 = new Product(2, "Laptop", 5, 2000);
		Product prod3 = new Product(3, "Shoes", 5, 300);
		Product prod4 = new Product(4, "Shirt", 5, 500);
		Product prod5 = new Product(5, "Keyboard", 5, 250);
		

		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);
		prods.add(prod5);
		
		
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("DAO is destroyed.");
		
	}
	
		
		
	public List<Product> findAll(){
		return this.prods;
	}
	
	public void save(Product product) {
		this.prods.add(product);
	}
	
	
	
}
