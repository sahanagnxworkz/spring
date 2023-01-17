package com.xworkz.di.bean;

import org.springframework.stereotype.Component;

import com.xworkz.di.inteface.Fuel;
@Component
public class Diesel implements Fuel {
	
	
	public Diesel() {
		System.out.println("no-arg const in diesel..");
	}

	@Override
	public void consume() {
		System.out.println("running abstract method");

	}
}
