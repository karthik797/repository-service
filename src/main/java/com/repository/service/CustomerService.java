package com.repository.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.repository.configurations.CustomerRepository;
import com.repository.controller.CustomerController;
import com.repository.model.Customer;
import com.repository.model.CustomersCategory;

@Service
public class CustomerService {

    private static final Logger LOGGER = LogManager.getLogger(CustomerController.class);
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> result= customerRepository.findAll();
		return result;
	}
	public Customer createCustomer(Customer customer)
	{
		
		Customer result= customerRepository.insert(customer);
		return result;
	}
	public Customer getCustomer(String customerId) {
		Customer result= customerRepository.findByCustomerId(customerId);
		return result;
	}
	public UpdateResult updateCustomerCategory(CustomersCategory customerCategory, String customerId)
	{
		
		Query query = new Query(Criteria.where("customerId").is(customerId));
		UpdateResult result = mongoTemplate.updateFirst(query, Update.update("customersCategory", customerCategory), Customer.class);
		LOGGER.info(result.unacknowledged());
		return null;
	}
	
	
}
