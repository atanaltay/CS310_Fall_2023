package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.components.CustomerService;
import com.example.service.ProductService;

@SpringBootApplication(scanBasePackages = {"com.components","com.example.dao","com.example.service"})
public class Application implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	ApplicationContext ctx;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ProductService srv = ctx.getBean(ProductService.class);
		
		srv.getAllProducts().forEach(p->{
			logger.info(p.toString());
		});
		
		
		logger.info("-----------------------");
		
		
		CustomerService custSrv = ctx.getBean(CustomerService.class);
		
		logger.info(custSrv.testCustomerService());
		
		
		
	}

}
