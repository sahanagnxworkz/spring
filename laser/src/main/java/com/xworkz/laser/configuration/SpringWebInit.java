package com.xworkz.laser.configuration;

import java.util.Arrays;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit
extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		System.out.println("running getServletConfigClasses ");
		Class[] ref = { SpringBeanConfiguration.class };
		System.out.println("reference :" + Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running  getServletMappings");
		String[] ref = { "/" };
		System.out.println(Arrays.toString(ref));
		return ref;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running  configureDefaultServletHandling");
		
		configurer.enable();
	}

}
