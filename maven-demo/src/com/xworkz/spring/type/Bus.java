package com.xworkz.spring.type;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	String location="bangalore";
	public Bus() {
		System.out.println("running bussing spring...");
	}
	public boolean name() {
		System.out.println(location);
		return true;
	}
}
