package com.xworkz.task.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.task")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("running SpringConfiguration with no-arg constructor");
	}
}
