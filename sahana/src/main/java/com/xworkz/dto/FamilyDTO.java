package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyDTO {

	
	private String name;
	private String ownerName;
	private String houseName;
	private String location;
	private int total;
	private int noOfFloors;
	private boolean animals;
	private double income;
	private boolean jointFamily;
	private boolean sibling;
	
}
