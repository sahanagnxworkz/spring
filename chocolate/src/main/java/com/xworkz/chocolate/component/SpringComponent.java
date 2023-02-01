package com.xworkz.chocolate.component;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {

	public SpringComponent() {
		System.out.println("running :" + this.getClass().getSimpleName());
	}
}
