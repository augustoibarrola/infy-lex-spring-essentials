package com.infy.springessentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.springessentials.bean.Customer;
import com.infy.springessentials.bean.Plan;

@SpringBootTest
class ApplicationTests {
	
	@Mock
	private Plan plan;
	
	@InjectMocks
	private Customer customer = new Customer();

	@Test
	void contextLoads() {
	}
	
	@Test
	public void registerTestValidPlan() throws Exception{
		String planName = "PREPAID";
		Mockito.when(plan.enrollToPlan("PREPAID")).thenReturn(true);
		String actual = customer.register("PREPAID");
		Assertions.assertEquals("Customer enrolled to Plan" , actual);
	}
	
	@Test
	public void registerTestInvalidPlan() {
		String planName="POSTPAID";
		Mockito.when(plan.enrollToPlan(planName)).thenReturn(false);
		Exception exception = Assertions.assertThrows(Exception.class, ()-> customer.register(planName));
		
		Assertions.assertEquals("Customer not registered!", exception.getMessage());
	}

}
