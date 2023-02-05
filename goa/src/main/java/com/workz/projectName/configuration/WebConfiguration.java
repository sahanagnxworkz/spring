package com.workz.projectName.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.workz.projectName")
public class WebConfiguration {

	public WebConfiguration() {
	System.out.println("running " + this.getClass().getSimpleName());
	}
}
