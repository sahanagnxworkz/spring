package com.xworkz.sahana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "terrorist_table")
public class TerroristEntity {

	@Id
	@Column(name = "t_id")
	private int id;
	
	@Column(name = "t_name")
	private String name;
	
	@Column(name = "t_country")
	private String country;
	
	@Column(name = "t_age")
	private int age;
	
	@Column(name = "t_punishment")
	private int punishment;
}
