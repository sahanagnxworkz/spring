package com.xworkz.validation.boot;

import com.xworkz.validation.dto.SoldierDto;
import com.xworkz.validation.repository.SoldierRepositoryImpl;
import com.xworkz.validation.service.SoliderServiceImpl;

public class SoldierRunner {
public static void main(String[] args) {

SoldierDto dto=new SoldierDto("Sahana","Bangalore" ,22, 10);
SoliderServiceImpl serviceImpl=new SoliderServiceImpl();
SoldierRepositoryImpl repositoryImpl=new SoldierRepositoryImpl();
serviceImpl.setRepository(repositoryImpl);
serviceImpl.validateAndSave(dto);
}
}
