package com.xworkz.autoWired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autoWired")
public class AutoWiredBeans {

	@Bean
	public int id() {
		System.out.println("running id bean.....");
		int id = 10;
		return id;
	}

	@Bean
	public String name() {
		System.out.println("running name harware...");
		String name = "ScrewDriver";
		return name;
	}

	@Bean("gstNo")
	public double gstNo() {
		System.out.println("running number bean.....");
		int number = 30;
		return number;
	}

	@Bean
	public String ownerName() {
		System.out.println("running Owner name harware...");
		String ownerName = "Sahana";
		return ownerName;
	}

	@Bean
	public String location() {
		System.out.println("running location harware...");
		String location = "bangalore";
		return location;
	}

	@Bean("nameOfSW")
	public String nameOfSW() {
		System.out.println("running name of SoftWare ...");
		String name = "Computer";
		return name;
	}

	@Bean("version")
	public double versionOfSE() {
		System.out.println("running version of SoftWare ...");
		double version = 2.37;
		return version;
	}

	@Bean("developer")
	public boolean developer() {
		System.out.println("running developer of SoftWare ...");
		boolean developer = true;
		return developer;
	}

	@Bean
	public LocalDate date() {
		System.out.println("running date");
		LocalDate date = LocalDate.now();
		return date;
	}

	@Bean
	public boolean free() {
		System.out.println("running free....");
		boolean free = false;
		return free;
	}
}
