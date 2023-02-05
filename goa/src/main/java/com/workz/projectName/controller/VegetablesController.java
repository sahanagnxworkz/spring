package com.workz.projectName.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workz.projectName.dto.VegetablesDTO;

@Component
@RequestMapping("/vegetables")
public class VegetablesController {

	public VegetablesController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String veg(VegetablesDTO dto,Model model) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("price", dto.getPrice());
		model.addAttribute("quantity", dto.getQuantity());
		System.out.println("running dopost..........");
		System.out.println(dto);
		return "VegetableSucces.jsp";
	}
}
