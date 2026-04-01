package com.infy.springessentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.springessentials.bean.Customer;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	Customer customer;

	@Test
	void contextLoads() {
	}

	@Test
	public void registerTestValidPlan() throws Exception{
		String actual = customer.register("PREPAID");
		Assertions.assertEquals("Customer enrolled to Plan" , actual);
	}
	
	@Test
	public void registerTestInvalidPlan() throws Exception{
		Exception exception = Assertions.assertThrows(Exception.class, ()->customer.register("POSTPAID"));
		Assertions.assertEquals("Customer not registered!", exception.getMessage());
	}
}
