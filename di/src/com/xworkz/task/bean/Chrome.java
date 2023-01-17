package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	@Override
	public void browser() {
		System.out.println("override browser...in chrome impl...");
		provider.connect();
	}
}
