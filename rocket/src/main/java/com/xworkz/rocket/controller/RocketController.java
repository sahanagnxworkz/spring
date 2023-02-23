package com.xworkz.rocket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.rocket.dto.RocketDTO;
import com.xworkz.rocket.service.RocketService;


@Controller
@RequestMapping("/")
public class RocketController {

	@Autowired
	private RocketService rocketService;

	private List<String> types = Arrays.asList("Solid-Fuel Rocket", "Liquid-Fuel Rocket", "Ion Rocket",
			"Plasma Rocket");
	private List<String> countrys = Arrays.asList("India", "USA", "JApan", "china", "Afganisthan", "Nepal");

	public RocketController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/rocket")
	public String onValentine(Model model) {
		System.out.println("running onRocket");
		model.addAttribute("types", types);
		model.addAttribute("countrys", countrys);
		return "Rocket.jsp";
	}
	
	@PostMapping("/rocket")
	public String onRocket(Model model, RocketDTO dto) {
		System.out.println("running onRocket.." + dto);
	Set<ConstraintViolation<RocketDTO>> violations = this.rocketService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("running validate save && no violations...");			
			return "RocketSuccess.jsp";
		} else {
			model.addAttribute("types", types);
			model.addAttribute("countrys", countrys);
			model.addAttribute("errors", violations);
			model.addAttribute("dto", dto);
			System.err.println("violations in controller....");
			return "Rocket.jsp";
		}
	}
	
	@GetMapping("/search")
	public String serachById(@RequestParam int id, Model model) {
		System.out.println("running Search method...");
		RocketDTO dto = this.rocketService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");

		}
		return "RocketSearch.jsp";
	}
}
