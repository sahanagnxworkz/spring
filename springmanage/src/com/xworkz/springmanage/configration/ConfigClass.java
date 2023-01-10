package com.xworkz.springmanage.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.xworkz.springmanage.type.Chocolate;

@Configuration
@ComponentScan("com.xworkz.springmanage")
public class ConfigClass {

	@Bean
	public int sahana() {
		System.err.println("running Integer method.........");
		//Integer integer = new Integer(10);
		return 0;
	}

	@Bean("display")
	public String display() {
		System.out.println("running display 1 ........");
		String ref = new String();
		return ref;
	}

	@Bean("display age")
	public String displayAge() {
		String ref = new String();
		System.out.println("running display  parameter ........");
		return ref;
	}

	@Bean("display name")
	public String displayName() {
		String ref = new String();
		System.out.println("running display  name .....");
		return ref;
	}

	@Bean("display location")
	public String displayLocation() {
		String ref = new String();
		System.out.println("running display lacation  .....");
		return ref;
	}

	@Bean("display state")
	public String displayState() {
		String ref = new String();
		System.out.println("running display state  .....");
		return ref;
	}

	@Bean("is graduate...")
	public boolean isGraduate() {
		Boolean ref = new Boolean(true);
		System.out.println("running display Boolean Exp  .....");
		// System.out.println(ref);
		return ref;
	}

	@Bean("remock...")
	public boolean isReMock() {
		Boolean ref = new Boolean(true);
		System.out.println("running display Boolean reMock  .....");
		// System.out.println(ref);
		return ref;
	}

	@Bean("God")
	public boolean God() {
		Boolean ref = new Boolean(true);
		System.out.println("running display Boolean God  .....");
		// System.out.println(ref);
		return ref;
	}

	@Bean("isAddress...")
	public boolean isAddress() {
		Boolean ref = new Boolean(true);
		System.out.println("running display Boolean isAddress  .....");
		// System.out.println(ref);
		return ref;
	}

	@Bean("reMock...")
	public boolean reMock() {
		Boolean ref = new Boolean(true);
		System.out.println("running display Boolean reMock  .....");
		// System.out.println(ref);
		return ref;
	}
	@Bean("sahana")
	public StringBuffer buffer1() {
		System.err.println("running String buffer1 in chocoate class ");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

}
