package com.xworkz.task.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.bean.Browser;
import com.xworkz.task.bean.Chrome;
import com.xworkz.task.configuration.SpringConfiguration;

public class Runner {
public static void main(String[] args) {
	
	ApplicationContext container= new AnnotationConfigApplicationContext(SpringConfiguration.class);
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	
	
	Chrome browser=container.getBean(Chrome.class);
	browser.browser();
	

	Browser chrome=container.getBean(Chrome.class);
	browser.browser();
}
}
