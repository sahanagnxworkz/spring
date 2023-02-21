package com.xworkz.bigBasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigBasket.dto.BigBasketDTO;

public interface BigBasketService {

	Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO basketDTO);

	 

}
