package com.xworkz.autoWired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autoWired.beans.HardWare;
import com.xworkz.autoWired.beans.Software;
import com.xworkz.autoWired.configuration.AutoWiredBeans;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AutoWiredBeans.class);

		String[] ref = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		Integer hardware = container.getBean("id", Integer.class);
		System.out.println(hardware);
		Double number = container.getBean("gstNo", Double.class);
		System.err.println(number);

		HardWare hardWare2 = container.getBean(HardWare.class);
		System.out.println(hardWare2);
		
		Software software = container.getBean(Software.class);
		System.out.println(software);
	}
}
