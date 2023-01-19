package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.repository.ResortRepository;
@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepository repository;
	@Autowired
	public ResortServiceImpl(ResortRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(ResortDTO resortDTO) {
		System.out.println("running service impl" + resortDTO);
		ValidatorFactory valFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = valFactory.getValidator();

		Set<ConstraintViolation<ResortDTO>> voilations = validator.validate(resortDTO);
		if(!voilations.isEmpty()) {
			System.err.println("dto is  Invalid " );
			voilations.forEach(e->System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("dto is valid");
			boolean saved=this.repository.save(resortDTO);
			return saved;
		}	}
}
