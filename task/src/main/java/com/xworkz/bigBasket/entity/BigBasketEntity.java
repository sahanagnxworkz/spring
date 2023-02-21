package com.xworkz.bigBasket.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "bigbasket_table")
public class BigBasketEntity {
	@Id
	@Column(name = "b_id")
	private int id;
	
	@Column(name = "b_email")
	private String email;
	
	@Column(name = "b_password")
	private String password;
	
	@Column(name = "b_location")
	private String location;
	
	@Column(name = "b_itemName")
	private String itemName;
	
	@Column(name = "b_price")
	private double itemPrice;

	@Column(name = "b_itemBrandName")
	private String itemBrandName;
	
	@Column(name = "b_since")
	private double since;
	
	@Column(name = "b_noOfbranchs")
	private int noOfbranchs;
	
	@Column(name = "b_manfDate")	
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	private Date manfDate;
	
	@Column(name = "b_expDate")
	private double expDate;
}
