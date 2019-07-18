package com.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.configurations.CustomerRepository;
import com.repository.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{
		return null;
	}
	public Customer createCustomer(Customer customer)
	{
		
		customerRepository.save(customer);
		return null;
	}
}
