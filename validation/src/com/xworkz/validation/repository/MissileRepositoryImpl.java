package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;
@Component
public class MissileRepositoryImpl implements MissileRepository {
	@Override
	public boolean save(MissileDTO dto) {
	System.out.println("running repo -->dto :"+dto);
		return false;
	}
}
