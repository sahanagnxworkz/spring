package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@Component
@ToString
public class FirstAidRepositporyImpl implements FirstAidRepositpory {
	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("running save impl...");
		System.out.println("dto :"+aidDTO);
		return true;
	}
}
