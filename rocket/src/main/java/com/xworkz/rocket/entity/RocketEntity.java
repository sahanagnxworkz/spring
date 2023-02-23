package com.xworkz.rocket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
@Table(name = "rocket_table")
public class RocketEntity {

	@Id
	@Column(name = "r_id")
	private int id;

	@NotBlank
	@Column(name = "r_company")
	private String company;

	@NotBlank
	@Column(name = "r_name")
	private String name;

	@NotBlank
	@Column(name = "r_cost")
	private String cost;

	@NotBlank
	@Column(name = "r_type")
	private String type;

	@NotBlank
	@Column(name = "r_country")
	private String country;
}
