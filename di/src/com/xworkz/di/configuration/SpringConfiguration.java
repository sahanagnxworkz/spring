package com.xworkz.di.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.di")
public class SpringConfiguration {
	public SpringConfiguration() {
	System.out.println("running SpringConfiguration");
	}
}
