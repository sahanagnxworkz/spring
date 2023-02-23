package com.xworkz.rocket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.rocket.dto.RocketDTO;


public interface RocketService {

	Set<ConstraintViolation<RocketDTO>> validateAndSave(RocketDTO dto);

	default RocketDTO findById(int id) {
		return null;
	}

}
