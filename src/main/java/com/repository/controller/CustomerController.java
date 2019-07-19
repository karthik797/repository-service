package com.repository.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.repository.model.Customer;
import com.repository.model.CustomersCategory;
import com.repository.service.CustomerService;;


@RestController
@RequestMapping(value = "/")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
    private static final Logger LOGGER = LogManager.getLogger(CustomerController.class);
	
	@GetMapping(value="/customers")
    public List<Customer> getListOfCustomers()
    {
		return customerService.getAllCustomers();
    }

	
	@PostMapping(path="/customer")
    public Customer createCustomer( @RequestBody @Valid Customer customer)
    {
		LOGGER.info("CustomerId " + customer.getCustomerId());
       return customerService.createCustomer(customer);
    }
	


	@GetMapping(path="/customer/{customerId}")
    public Customer getCustomer( @PathVariable String customerId)
    {
		LOGGER.info("CustomerId " + customerId);
       return customerService.getCustomer(customerId);
    }

}
