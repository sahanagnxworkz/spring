package com.xworkz.bigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.entity.BigBasketEntity;
import com.xworkz.bigBasket.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpl implements BigBasketService {
	@Autowired
	private BigBasketRepository basketRepository;

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO basketDTO) {
		System.out.println("running validate and save method " + basketDTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> violations = validator.validate(basketDTO);
		if (violations != null && !violations.isEmpty()) {

			System.err.println("violations in your data check it " + basketDTO);
			violations.forEach(e -> e.getMessage());

			return violations;
		} else

		{
			System.out.println("data is good " + basketDTO);
			BigBasketEntity basketEntity = new BigBasketEntity();
			basketEntity.setEmail(basketDTO.getEmail());
			basketEntity.setPassword(basketDTO.getPassword());
			basketEntity.setLocation(basketDTO.getLocation());
			basketEntity.setItemName(basketDTO.getItemName());
			basketEntity.setItemPrice(basketDTO.getItemPrice());
			basketEntity.setItemBrandName(basketDTO.getItemBrandName());
			basketEntity.setSince(basketDTO.getSince());
			basketEntity.setNoOfbranchs(basketDTO.getNoOfbranchs());
			basketEntity.setManfDate(basketDTO.getManfDate());
			basketEntity.setExpDate(basketDTO.getExpDate());
			boolean saved = this.basketRepository.save(basketEntity);
			System.out.println("entity fdata :" + saved);
			return Collections.emptySet();

		}
	}
}
