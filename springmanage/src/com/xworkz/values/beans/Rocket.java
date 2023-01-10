package com.xworkz.values.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Rocket {
	@Value("India")
	private String country;
	@Value("Indigo")
	private String name;
	@Value("20000")
	private double budget;

	public Rocket() {
		System.out.println("runnig deft constructor...");
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}
}
