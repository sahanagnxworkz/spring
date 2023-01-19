package com.xworkz.validation.service;

import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.dto.ResortDTO;

public interface MissileService {
 
	boolean validateAndSave(MissileDTO missileDTO);
}
