package com.repository.configurations;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.repository.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	Customer findByCustomerId(String customerId);
}
