package com.xworkz.rocket.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.rocket.dto.RocketDTO;
import com.xworkz.rocket.entity.RocketEntity;
import com.xworkz.rocket.repository.RocketRepository;


@Service
public class RocketServiceImpl implements RocketService {
	@Autowired
	private RocketRepository repository;

	
	public RocketServiceImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<RocketDTO>> validateAndSave(RocketDTO dto) {
		System.out.println("running validate and save...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RocketDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("violations in dto check :" + dto);
			return constraintViolations;
		} else {
			System.out.println("data is good can save to data ");
			RocketEntity entity = new RocketEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved = this.repository.save(entity);
			System.out.println("data is saved :"+saved);
			
			return Collections.emptySet();
		}

	}
	@Override
	public RocketDTO findById(int id) {
		System.out.println("overriding find by id method...");
		if (id > 0) {
			RocketEntity entity = this.repository.findById(id);
			if (entity != null) {
				System.out.println("entity/data found from database");
				RocketDTO dto = new RocketDTO();
				dto.setName(entity.getName());
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setId(entity.getId());
				return dto;
			} else {
				System.err.println("data not found for id :" + id);

			}
		} else {
			System.err.println("invalid id :" + id);
		
		}
		return null;

	}

}
