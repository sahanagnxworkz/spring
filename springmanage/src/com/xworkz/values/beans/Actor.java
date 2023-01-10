package com.xworkz.values.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String lang;
	private int age;

//	public Actor() {
//		System.out.println("runing actor deft const......");
//	}

	public Actor(@Value("yash") String name, @Value("kannada") String lang, @Value("30") int age) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}

	public int getAge() {
		return age;
	}
}
