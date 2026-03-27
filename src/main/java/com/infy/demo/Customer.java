package com.infy.demo;

public class Customer {
	
	private String customerName;

	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String registerCustomer(String customerName) {
		return "Welcome " + customerName + "! You're now a registered user!";
	}
			
}
