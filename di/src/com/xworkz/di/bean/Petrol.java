package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.di.inteface.Fuel;

@Component
public class Petrol implements Fuel {
	
	@Autowired
	private Fuel fuel;

	@Override
	public void consume() {
		System.out.println("running consume.....");
	}
}
