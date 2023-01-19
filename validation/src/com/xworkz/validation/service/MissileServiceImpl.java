package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.repository.MissileRepository;
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepository missileRepository;

	@Autowired
	public MissileServiceImpl(MissileRepository missileRepository) {
		super();
		this.missileRepository = missileRepository;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running service impl" + dto);
		ValidatorFactory valFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = valFactory.getValidator();

		Set<ConstraintViolation<MissileDTO>> voilations = validator.validate(dto);
		if(!voilations.isEmpty()) {
			System.err.println("dto is  Invalid " );
			voilations.forEach(e->System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("dto is valid");
			boolean saved=this.missileRepository.save(dto);
			return saved;
		}
	
	}
}
