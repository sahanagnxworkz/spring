package com.xworkz.sahana.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.sahana.dto.TerroristDto;
import com.xworkz.sahana.entity.TerroristEntity;
import com.xworkz.sahana.repository.TerroristRepository;

@Service
public class TerroristServiceImpl implements TerroristService {

	@Autowired
	private TerroristRepository repository;

	public TerroristServiceImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<TerroristDto>> saveAndValidate(TerroristDto dto) {
		System.out.println("running saveAndValidate");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in data is cannot save");
			return violations;
		} else {
			System.out.println("No violations in data can be saved");
			TerroristEntity entity = new TerroristEntity();
			entity.setName(dto.getName());
			entity.setCountry(dto.getCountry());
			entity.setAge(dto.getAge());
			entity.setPunishment(dto.getPunishment());

			Boolean saved = repository.save(entity);
			System.out.println("data saved... " + saved);
			return Collections.emptySet();
		}

	}
	
	@Override
	public TerroristDto findById(int id) {
		System.out.println("overriding find by id method...");
		if (id > 0) {
			TerroristEntity entity = this.repository.findById(id);
			if (entity != null) {
				System.out.println("entity/data found from database");
				TerroristDto dto = new TerroristDto();
				dto.setName(entity.getName());
				dto.setCountry(entity.getCountry());
				dto.setAge(entity.getAge());
				dto.setPunishment(entity.getPunishment());
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
