package com.xworkz.validation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class SoldierDto {

	@NotNull
	@NotBlank
	@Size(min = 5, max = 15, message = "name length should be 5 to 15")
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 15, message = "location length should be 5 to 15")
	private String location;
	@Max(60)
	@Min(22)
	private int age;
	@Max(30)
	@Min(2)
	private int services;


	
}
