package com.xworkz.task.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	@Override
	public void connect() {
		System.out.println("override connect...in jio impl..");

	}
}
