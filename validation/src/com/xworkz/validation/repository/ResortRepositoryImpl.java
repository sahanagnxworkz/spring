package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;
import com.xworkz.validation.dto.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository {
	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("running repo impll....: " + resortDTO);
		return false;
	}
}
