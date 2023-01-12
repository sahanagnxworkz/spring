package com.xworkz.autoWired.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("nameOfSW")
	private String name;
	@Autowired
	@Qualifier("version")
	private double version;
	@Autowired
	// @Qualifier("developer")
	private boolean developer;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	// @Qualifier("free")
	private boolean free;

	public Software() {
		System.out.println("running software.....");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
