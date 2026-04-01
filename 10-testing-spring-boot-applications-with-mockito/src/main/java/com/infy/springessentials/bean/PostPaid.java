package com.infy.springessentials.bean;

import org.springframework.stereotype.Component;

@Component(value = "postPaid")
public class PostPaid implements Plan {
	
	@Override
	public Boolean enrollToPlan(String planName) {
		return ((planName == "POSTPAID")? true : false);
	}

}
