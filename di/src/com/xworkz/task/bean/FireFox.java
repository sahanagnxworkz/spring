package com.xworkz.task.bean;

import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser {
	
	@Override
	public void browser() {
		System.out.println("running browser in firefox impl...");

	}
}
