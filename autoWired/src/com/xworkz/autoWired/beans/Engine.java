package com.xworkz.autoWired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	@Qualifier("engineLength")
	private double length;
	@Autowired
	@Qualifier("engineVersion")
	private String version;
	private String company;
	private String strokes;

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", length=" + length + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}

}
