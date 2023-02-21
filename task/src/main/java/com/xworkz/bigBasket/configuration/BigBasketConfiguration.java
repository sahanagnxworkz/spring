package com.xworkz.bigBasket.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.bigBasket")
public class BigBasketConfiguration {
	
	public BigBasketConfiguration() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

}
