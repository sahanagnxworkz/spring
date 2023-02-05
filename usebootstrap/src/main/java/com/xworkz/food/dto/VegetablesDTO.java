package com.xworkz.food.dto;

import org.springframework.ui.Model;
import lombok.Data;

@Data
public class VegetablesDTO {

	private String name;
	private int price;
	private double quantity;
	public VegetablesDTO() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
	
}
