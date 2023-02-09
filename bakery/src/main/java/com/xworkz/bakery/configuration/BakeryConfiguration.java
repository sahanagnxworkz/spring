package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class BakeryConfiguration {

	public BakeryConfiguration() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

}
