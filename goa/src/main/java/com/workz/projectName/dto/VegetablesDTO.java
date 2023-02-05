package com.workz.projectName.dto;

import lombok.Data;

@Data
public class VegetablesDTO {

	private String name;
	private int price;
	private Double quantity;
	@Override
	public String toString() {
		return "VegetablesDTO [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
