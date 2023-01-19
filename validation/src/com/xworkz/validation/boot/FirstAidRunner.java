package com.xworkz.validation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.SpringConfiguration;
import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.repository.ResortRepositoryImpl;
import com.xworkz.validation.service.FirstAidService;
import com.xworkz.validation.service.FirstAidServiceImpl;
import com.xworkz.validation.service.MissileService;
import com.xworkz.validation.service.MissileServiceImpl;
import com.xworkz.validation.service.ResortService;
import com.xworkz.validation.service.ResortServiceImpl;

public class FirstAidRunner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		FirstAidService aidService = container.getBean(FirstAidServiceImpl.class);
		boolean saved = aidService.validateAndSave(new FirstAidDTO());
		System.out.println("firstAid: "+saved);
		System.out.println("---------------------------------------------");
		MissileService missileService = container.getBean(MissileServiceImpl.class);
		boolean MissileSaved = missileService.validateAndSave(new MissileDTO());
		System.out.println("missile :"+MissileSaved);

		System.out.println("---------------------------------------------");
		ResortService resortDTO = container.getBean(ResortServiceImpl.class);
		boolean resortSaved = resortDTO.validateAndSave(new ResortDTO());
		System.out.println("resortSaved :"+resortSaved);
	}
}
