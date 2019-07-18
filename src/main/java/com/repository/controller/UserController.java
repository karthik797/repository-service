package com.repository.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.repository.model.Customer;
import com.repository.service.CustomerService;;


@RestController
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	CustomerService customerService;
	
    private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	
	@GetMapping(value="/customers")
    public List<Customer> getListOfCustomers()
    {
        return null;
    }

	
	@PostMapping(path="/customer")
    public List<Customer> createCustomer( @RequestBody Customer customer)
    {
		LOGGER.info("Customer: " + customer.getUserId());
		customerService.createCustomer(customer);
        return null;
    }

}
