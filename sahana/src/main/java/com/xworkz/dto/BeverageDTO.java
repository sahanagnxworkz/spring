package com.xworkz.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeverageDTO {

	private String name;
	private String type;
	private String location;
	private String shopOwner;
	private double price;
	private boolean good;
	private LocalDate manfDate;
	private LocalDate expDate;

	
}
