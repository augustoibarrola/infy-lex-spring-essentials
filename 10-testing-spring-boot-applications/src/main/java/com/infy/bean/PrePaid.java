package com.infy.bean;

import org.springframework.stereotype.Component;

@Component(value = "prePaid")
public class PrePaid implements Plan {

	@Override
	public Boolean enrollToPlan(String planName) {
		return ((planName == "PREPAID")? true : false);
	}

}
