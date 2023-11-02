package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(SpringFirstApplication.class);
	
	@Autowired
	ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
			logger.info("Welcome to the First Spring App");
		
			logger.info("The application exists...");
		
		
			ProductService srv = ctx.getBean(ProductService.class);
			
			srv.getAllProducts().forEach(p->{
				logger.info(p.toString());
			});
			
			logger.info("-------------------------");

			
			srv.saveProduct(new Product(100, "New Product", 10, 10));
			srv.saveProduct(new Product(101, "Second New Product", 10, 10));
			
			logger.info("-------------------------");
			
			srv = ctx.getBean(ProductService.class);
			srv.getAllProducts().forEach(p->{
				logger.info(p.toString());
			});
			
			logger.info("-------------------------");
			
			logger.info("Customer DAO:" + srv.callCustomerDAO());
			
			
			logger.info("-------------------------");
			
			CustomerService  custSrv = ctx.getBean(CustomerService.class);
			
			
			logger.info("Customer Service Test:" + custSrv.testCustomerService());
			
		
	}
	
	//Java BAsed Configuration
	//Two scopes: Default : Singleton
	//						Prototype Scope (always initialized)
	
	@Bean
	CustomerDAO customerDAO() {
		return new CustomerDAO();
	}
	
	@Bean
	//@Scope("prototype")
	ProducDAO productDAO() {
		
		return new ProducDAO();
	}
	
	@Bean
	//@Scope("prototype")
	ProductService productService() {
		
		return new ProductService(productDAO(),customerDAO());
		
		
	}
	
	@Bean
	CustomerService customerService() {
		return new CustomerService();
	}
	
	

}
