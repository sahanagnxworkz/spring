package com.xworkz.sahana.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.sahana.dto.TerroristDto;

public interface TerroristService {

	Set<ConstraintViolation<TerroristDto>> saveAndValidate(TerroristDto dto);
	
	default TerroristDto findById(int id) {
		return null;
	}

}
