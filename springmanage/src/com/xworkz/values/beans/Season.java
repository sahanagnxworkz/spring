package com.xworkz.values.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	@Value("chaliGala")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	@Value("6")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("december")

	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
