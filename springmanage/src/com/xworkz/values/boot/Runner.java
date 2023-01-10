package com.xworkz.values.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.values.beans.Actor;
import com.xworkz.values.beans.Rocket;
import com.xworkz.values.beans.Season;
import com.xworkz.values.configuration.Configartion;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configartion.class);

		String[] def = applicationContext.getBeanDefinitionNames();

		System.out.println(Arrays.toString(def));

		Rocket rocket = applicationContext.getBean("rocket", Rocket.class);
		System.out.println(rocket);
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getBudget());

		Rocket rocket2 = applicationContext.getBean("display", Rocket.class);
		System.out.println(rocket2);
		System.out.println(rocket2.getCountry());
		System.out.println(rocket2.getName());
		System.out.println(rocket2.getBudget());
		System.err.println("----------------------------------------");
		Actor name = applicationContext.getBean("actor", Actor.class);
		System.out.println(name);
		System.out.println(name.getAge());
		System.out.println(name.getLang());
		System.out.println(name.getName());

		Actor name1 = applicationContext.getBean("show", Actor.class);
		System.out.println(name1);
		System.out.println(name1.getAge());
		System.out.println(name1.getLang());
		System.out.println(name1.getName());
		System.err.println("---------------------------------------------");
		Season season = applicationContext.getBean("season", Season.class);

		System.out.println(season.getDuration());
		System.out.println(season.getName());
		System.out.println(season.getStartingMonth());

		Season season1 = applicationContext.getBean("showOff", Season.class);
		season1.setName("winter");
		season1.setDuration(4);
		season1.setStartingMonth("june");
		System.out.println(season1.getDuration());
		System.out.println(season1.getName());
		System.out.println(season1.getStartingMonth());
	}
}
