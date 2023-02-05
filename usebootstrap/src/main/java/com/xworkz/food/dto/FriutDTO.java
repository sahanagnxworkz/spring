package com.xworkz.food.dto;

import lombok.Data;

@Data
public class FriutDTO {

	private String name;
	private int quantity;
	private double price;

	
	public FriutDTO() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
}
