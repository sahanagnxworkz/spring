package com.xworkz.chocolate.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.chocolate")
public class SpringConfigurationClass {
	
	public SpringConfigurationClass() {
		System.out.println("running :"+this.getClass().getSimpleName());
	}

}
