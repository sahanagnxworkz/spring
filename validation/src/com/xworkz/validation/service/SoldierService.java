package com.xworkz.validation.service;

import com.xworkz.validation.dto.SoldierDto;

public interface SoldierService {

	boolean validateAndSave(SoldierDto dto);
}
