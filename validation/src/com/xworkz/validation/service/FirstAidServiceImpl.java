package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.repository.FirstAidRepositpory;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepositpory aidRepositpory;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepositpory aidRepositpory) {
		this.aidRepositpory = aidRepositpory;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running first aid service Impl...validate and save mathod....");
		System.out.println("dto passed..." + dto);
	
		Set<ConstraintViolation<FirstAidDTO>> validation = validator.validate(dto);
		if (!validation.isEmpty()) {
			System.err.println("not validation happend");
			validation.forEach(e -> System.out.println(e.getMessage()));
			return false;	
		} else {
			boolean saved = this.aidRepositpory.save(dto);
				System.out.println("FirstAid dto is saved ..." + dto);
				System.out.println("FirstAid is valid and save ");
				return saved;
			}
	
	}
}
