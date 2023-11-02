package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProducDAO;
import com.example.model.Product;

//Business Logic
@Service
public class ProductService {

	@Autowired
	private ProducDAO productDAO;
	
	/*
	public ProductService(ProducDAO productDAO) {
		this.productDAO = productDAO;
	}
	*/
	
	public void saveProduct(Product p) {
		productDAO.save(p);
	}
	
	public List<Product> getAllProducts(){
		
		return productDAO.findAll();
		
		
		
	}
	
	
	
}
