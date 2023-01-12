package com.xworkz.autoWired.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pencil {
	@Autowired
	@Qualifier("nameOfSW")
	private String name;
	@Autowired
	@Qualifier("version")
	private String type;
	@Autowired
	// @Qualifier("developer")
	private boolean sharp;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	// @Qualifier("free")
	private boolean stolen;
}
