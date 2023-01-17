package com.xworkz.di.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.bean.Petrol;
import com.xworkz.di.configuration.SpringConfiguration;
import com.xworkz.di.inteface.Fuel;
import com.xworkz.di.inteface.PetrolBunk;

public class PetrolRunner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		PetrolBunk bunk = container.getBean(PetrolBunk.class);
	
	}
}
