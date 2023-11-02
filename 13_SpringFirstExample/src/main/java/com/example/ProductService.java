package com.example;

import java.util.List;

//Business Logic
public class ProductService {

	private ProducDAO productDAO;
	private CustomerDAO customerDAO;
	
	//Dependency Injection
	//Control of productDAO in service is INVERTED
	//INVERSION OF CONTROL
	public ProductService(ProducDAO productDAO, CustomerDAO customerDAO) {
		
		this.productDAO = productDAO;
		this.customerDAO = customerDAO;
		
		
	}
	
	public String callCustomerDAO() {
		return customerDAO.getInfo();
	}
	
	public void saveProduct(Product p) {
		productDAO.save(p);
	}
	
	public List<Product> getAllProducts(){
		
		return productDAO.findAll();
		
		
		
	}
	
	
	
}
