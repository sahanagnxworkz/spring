package com.xworkz.values.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.values.beans.Actor;
import com.xworkz.values.beans.Rocket;
import com.xworkz.values.beans.Season;

@Configuration
@ComponentScan("com.xworkz.values")
public class Configartion {

	@Bean
	public Rocket display() {
		System.out.println("running rocket in Bean.......");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor show() {
		System.out.println("running rocket in Bean.......");
		Actor actor = new Actor("nani", "telugu", 40);
		return actor;
	}

	@Bean
	public Season showOff() {
		Season kala = new Season();
		kala.setDuration(7);
		kala.setName("summer");
		kala.setStartingMonth("march");

		return kala;
	}
}
