package com.xworkz.validation.repository;

import com.xworkz.validation.dto.SoldierDto;

public class SoldierRepositoryImpl implements SoldierRepository {

	public SoldierRepositoryImpl() {
		System.out.println("running SoldierRepository implimenation......");
	}

	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("running SoldierRepository implimenation......Save method");
		System.out.println("Solider dto  :" + dto);
		return false;
	}
}
