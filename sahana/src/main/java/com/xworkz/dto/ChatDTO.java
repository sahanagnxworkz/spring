package com.xworkz.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatDTO {

	private String name;
	private String type;
	private String shopName;
	private String location;
	private String areaName;
	private int ingridents;
	private int priceOnOne;
	private double total;
	private boolean good;
	private LocalDate manfDate;
	private LocalDate expDate; 
}
