package com.xworkz.sahana.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TerroristDto {

	private int id;
	@NotNull
	private String name;
	@NotNull
	private String country;
	@NotNull
	private int age;
	@NotNull
	private int punishment;
}
