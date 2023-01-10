package com.xworkz.spring.type;

import org.springframework.stereotype.Component;

@Component
public class Road {
	int location;

	public Road() {
		System.out.println("running Road using spring....");
	}
	public void name() {
		System.out.println(location);
	}
}
