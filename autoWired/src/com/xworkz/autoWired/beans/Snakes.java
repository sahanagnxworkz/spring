package com.xworkz.autoWired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snakes {

	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;

	private String type;

	private boolean poisionous;

	public Snakes(@Qualifier("snakeName") String name, @Qualifier("snakeType") String type,
			@Qualifier("snakePoisionous") boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snakes [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
