package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.SoldierDto;
import com.xworkz.validation.repository.SoldierRepository;
import com.xworkz.validation.repository.SoldierRepositoryImpl;

import lombok.Getter;
import lombok.Setter;


@Setter
public class SoliderServiceImpl implements SoldierService {

	private SoldierRepositoryImpl repository;

	public SoliderServiceImpl() {
		System.out.println("running soldier service Impl.... NO-ARG Cons...");
	}

	@Override
	public boolean validateAndSave(SoldierDto dto) {
		System.out.println("running soldier service Impl...validate and save mathod....");
		System.out.println("dto passed..." + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> validation = validator.validate(dto);
		if (!validation.isEmpty()) {
			System.err.println("not validation happend");
			validation.forEach(e -> System.out.println(e.getMessage()));
		} else {
			boolean saved = this.repository.save(dto);
			if (dto != null) {
				System.out.println("solider dto is saved ..." + dto);
				System.out.println("solider is valid and save ");
				return true;
			}
		}
	
		return false;
	}
}
