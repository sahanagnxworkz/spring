package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SahanaConfiguration {

	public SahanaConfiguration() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
}
