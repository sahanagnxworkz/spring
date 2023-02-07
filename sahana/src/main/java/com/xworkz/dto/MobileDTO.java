package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileDTO {
	private String name;
	private double price;
	private int ram;
	private String color;
	private boolean good;
}
