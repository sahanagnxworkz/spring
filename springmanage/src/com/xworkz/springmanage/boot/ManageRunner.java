package com.xworkz.springmanage.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.xworkz.springmanage.configration.ConfigClass;
import com.xworkz.springmanage.type.Chocolate;
import com.xworkz.springmanage.type.CollectionAndMap;

public class ManageRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class,CollectionAndMap.class
				,Chocolate.class);
		String[] ref = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		String refs = applicationContext.getBean(String.class);
		System.out.println(refs);
		System.err.println("------------------------------");
		ConfigClass getBean = applicationContext.getBean(ConfigClass.class);
		System.out.println(getBean.hashCode());

	
	}

}
