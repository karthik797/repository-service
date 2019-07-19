package com.repository.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	
	

	
	private String customerId=new ObjectId().toString();
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(ObjectId customerId) {
	
	}
	@NotNull
	private CustomersCategory customersCategory;
	public CustomersCategory getCustomersCategory() {
		return customersCategory;
	}
	public void setCustomersCategory(CustomersCategory customersCategory) {
		this.customersCategory = customersCategory;
	}
	
	
	
}
