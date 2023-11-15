package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Address;
import com.sabanciuniv.model.Supplier;

public interface SupplierDAO extends MongoRepository<Supplier, String>{

	public List<Supplier> findByName(String name);
	
	public List<Supplier> findByNameContainsIgnoreCase(String name);
	
	//$regex is a special word for mongo queries.
	@Query("{name:{$regex:?0,$options:'i'}}")
	public List<Supplier> findByNameParam1(String name);
	
	//Don't forget to put the single quotes when using "." operator
	@Query("{'address.city':?0}")
	public List<Supplier> findByCityWithParam(String city);
	

}
