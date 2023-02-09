package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	private BakeryService bakeryService;

	public BakeryController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@GetMapping("/bakery")
	public String display(BakeryDTO bakeryDTO, Model model) {
		model.addAttribute("name", bakeryDTO.getName());
		model.addAttribute("ownerName", bakeryDTO.getOwnerName());
		model.addAttribute("ownerWifeName", bakeryDTO.getOwnerWifeName());
		model.addAttribute("married", bakeryDTO.isMarried());
		model.addAttribute("famouseFor", bakeryDTO.getFamouseFor());
		model.addAttribute("since", bakeryDTO.getSince());
		boolean valid = bakeryService.validateAndSave(bakeryDTO);
		System.out.println("validate.... " + valid);
		return "BakerySuccess.jsp";
	}
}
