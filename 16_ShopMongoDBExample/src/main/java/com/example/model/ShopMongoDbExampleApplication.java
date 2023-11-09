package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.dao.SupplierDAO;
import com.sabanciuniv.model.Address;
import com.sabanciuniv.model.Supplier;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.example.dao"})
public class ShopMongoDbExampleApplication implements CommandLineRunner{

	@Autowired SupplierDAO suppDao;
	
	Logger logger = LoggerFactory.getLogger(ShopMongoDbExampleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ShopMongoDbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		if(suppDao.count()==0) {
			
			Address add1 = new Address("ISTANBUL", "1234");
			Supplier supSony = new Supplier("Sony", add1);
			
			Address add2 = new Address("ANKARA", "1234");
			Supplier supSamsung = new Supplier("Samsung", add2);
			
			Address add3 = new Address("ISTANBUL", "1234");
			Supplier supMicrosoft = new Supplier("Microsoft", add3);
			
			
			List<Supplier> suppliers = new ArrayList<>();
			suppliers.add(supSony);
			suppliers.add(supSamsung);
			suppliers.add(supMicrosoft);
			
			
			suppDao.insert(suppliers);
			logger.info("SUppliers are inserted");
			
			
		}
		
		logger.info("---------------");
		
		suppDao.findAll().forEach(sup->logger.info(sup.toString()));
		
		logger.info("---------------");
		
		suppDao.findByName("Microsoft").forEach(supp->logger.info("Found:" + supp.toString()));
		
		logger.info("---------------");
		
		
		suppDao.findByNameContainsIgnoreCase("micro").forEach(
				supp->logger.info(supp.toString()));
		
		logger.info("-------findByNameParam--------");
		
		
		suppDao.findByNameParam1("Microsoft").forEach(
				supp->logger.info(supp.toString()));
		
		
		logger.info("-------CITIES--------");
		
		
		suppDao.findByCityWithParam("ISTANBUL").forEach(
				supp->logger.info(supp.toString()));
	}

}
