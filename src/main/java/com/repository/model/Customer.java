package com.repository.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	private int customerId;
	private CustomersCategory customersCategory;
	public int getUserId() {
		return customerId;
	}
	public void setUserId(int customerId) {
		this.customerId = customerId;
	}
	public CustomersCategory getCustomersCategory() {
		return customersCategory;
	}
	public void setCustomersCategory(CustomersCategory scustomersCategory) {
		this.customersCategory = customersCategory;
	}
	public Customer() {
		super();
	}
	
	
}
