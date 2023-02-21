package com.xworkz.bigBasket.dto;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class BigBasketDTO {

	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private String location;
	
	@NotNull
	private String itemName;
	
	@NotNull
	private double itemPrice;
	
	@NotNull
	private String itemBrandName;
	
	@NotNull
	private double since;
	
	@NotNull
	private int noOfbranchs;
	
	@NotNull
	private Date manfDate;
	
	@NotNull
	private double expDate;

}
