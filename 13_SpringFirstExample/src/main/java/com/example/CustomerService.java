package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

	
	@Autowired
	private CustomerDAO customerDAO;
	
	
	public String testCustomerService() {
		
		return customerDAO.getInfo();
		
		
	}
}
