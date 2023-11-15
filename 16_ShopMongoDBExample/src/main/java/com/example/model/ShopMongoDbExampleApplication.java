package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.dao.ProductDAO;
import com.example.dao.SupplierDAO;
import com.sabanciuniv.model.Address;
import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.Supplier;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.example.dao"})
public class ShopMongoDbExampleApplication implements CommandLineRunner{

	@Autowired SupplierDAO suppDao;
	@Autowired ProductDAO prodDao;
	
	@Autowired MongoTemplate mongoTemplate;
	
	Logger logger = LoggerFactory.getLogger(ShopMongoDbExampleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ShopMongoDbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*

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
		
		*/
		
		//Supplier sony = suppDao.findById("654ca3054495e418e9c7bc54").get();
		
		//Product prod1 = new Product("TV", 100, 5000, sony);
		
		//prodDao.insert(prod1);
		
		//logger.info("-------SAVED PRODUCTS-----");
		//List<Product> prods=  prodDao.findByName("TV");
		
		//prods.forEach(prod->logger.info(prod.toString()));
		
		//Supplier supMicrosoft = new Supplier();
		//supMicrosoft.setId("654ca3054495e418e9c7bc56");
		/*
		Product prod2 = new Product("Mouse",200, 250, supMicrosoft);
		
		prodDao.insert(prod2);
		*/
		/*
		Product prod3 = new Product("Keyboard",100, 150, supMicrosoft);
		Product prod4 = new Product("Mouse",200, 250, supMicrosoft);
		Product prod5 = new Product("Mouse",200, 250, sony);
		
		prodDao.insert(prod3);
		prodDao.insert(prod4);
		prodDao.insert(prod5);
		
		*/
		
		/*
		List<Product> prods = prodDao.findBySupplier(supMicrosoft);

	 	logger.info(prods.get(0).getSupplier().getAddress().getCity());
	 	*/
		
		// save -> if id: update, else: insert
		
		/*
		Product keyboard = prodDao.findById("65546348a0d1cf2360e5d697").get();
		
		keyboard.setPrice(300);
		keyboard.setStock(400);
		
		Product keyboardUpdated = prodDao.save(keyboard);
		
	 	logger.info("----update-----");
	 	
	 	logger.info(String.valueOf(keyboardUpdated.getStock()));
	 	logger.info(String.valueOf(keyboardUpdated.getPrice()));
		*/
		
		
		//mongoTemplate.findAll(Product.class)
		//	.forEach(prod->logger.info(prod.toString()));
		
		/*
		Query query1 = new Query();
		query1.addCriteria(Criteria.where("name").is("Mouse"));

		mongoTemplate.find(query1, Product.class)
		.forEach(prod->logger.info(prod.toString()));
		*/
		
		Query query1 = new Query();
		query1.addCriteria(Criteria.where("name").regex("mouse", "i"));
		query1.addCriteria(Criteria.where("price").gt(200));
	
		query1.with(Sort.by(Sort.Direction.DESC, "price"));
		
		
		mongoTemplate.find(query1, Product.class)
		.forEach(prod->logger.info(prod.toString()));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
