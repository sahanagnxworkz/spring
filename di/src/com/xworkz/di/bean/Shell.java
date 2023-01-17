package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.inteface.Fuel;
import com.xworkz.di.inteface.PetrolBunk;

@Component
public class Shell implements PetrolBunk {
	
	@Override
	@Autowired
	public boolean purcahse(@Qualifier("diesel") Fuel fuel) {
		System.out.println("running purcahse");
		fuel.consume();
		return true;

	}
}
