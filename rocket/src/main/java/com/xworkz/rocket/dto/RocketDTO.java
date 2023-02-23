package com.xworkz.rocket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class RocketDTO {
	private int id;
	@NotBlank(message = "  sholud be selected")
	private String company;
	@NotBlank
	private String name;
	@NotBlank
	private String cost;
	@NotBlank(message = "  sholud be selected")
	private String type;
	@NotBlank(message = "  sholud be selected")
	private String country;
}
