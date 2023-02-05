package com.xworkz.food.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.food.dto.VegetablesDTO;
@Component
@RequestMapping("/vegetables")
public class VegetablesController {
	public VegetablesController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
	
	@PostMapping("vegetables")
	public String onVegetables(VegetablesDTO vegetablesDTO,Model model) {	
		System.out.println("running vegetables..."+vegetablesDTO);
		model.addAttribute("name",vegetablesDTO.getName());
		model.addAttribute("price",vegetablesDTO.getPrice());
		model.addAttribute("quantity",vegetablesDTO.getQuantity());
		return "VegetablesDetails.jsp";
	}
}
