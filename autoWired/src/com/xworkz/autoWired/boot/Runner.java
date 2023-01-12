package com.xworkz.autoWired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autoWired.beans.NewsPaper;
import com.xworkz.autoWired.configuration.ConfigurationClass;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		String[] ref = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		System.err.println("number of beans :" + container.getBeanDefinitionCount());

		NewsPaper newsPaper = container.getBean("newsPaper", NewsPaper.class);
		System.out.println(newsPaper);
		System.out.println("-------------------------");
		System.out.println(container.getBean("snakes"));
		System.out.println("-------------------------");
		System.out.println(container.getBean("snake1"));
		System.out.println("-------------------------");
		System.out.println(container.getBean("engine"));
		System.out.println("-------------------");
		System.out.println(container.getBean("ghost"));
	}
}
