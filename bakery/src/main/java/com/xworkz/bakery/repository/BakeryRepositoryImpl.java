package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepositoryImpl implements BakeryRepository {


	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("running BakeryRepository Impliments");
		return false;
	}

}
