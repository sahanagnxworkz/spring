package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepository bakeryRepository;

	public BakeryServiceImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) {
		System.out.println("running BakeryServiceImpl");
		boolean saved = bakeryRepository.save(bakeryDTO);
		System.out.println("saved sucess: " + saved);
		return false;
	}

}
