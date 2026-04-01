package com.infy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("prePaid")
	private Plan plan;
	
	public String register(String planName) throws Exception{
		
		if(plan.enrollToPlan(planName)) {
			return "Customer enrolled to Plan";
		}
		else {
			throw new Exception("Customer not registered!");
		}
	}

}
