package com.xworkz.sahana.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.sahana.dto.TerroristDto;
import com.xworkz.sahana.service.TerroristService;

@Controller
@RequestMapping("/")
public class TerroristController {
	
	@Autowired
	private TerroristService service;

	public TerroristController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@PostMapping("/terrorist")
	public String onTerrorist(Model model, TerroristDto dto) {
		System.out.println("running onTerrorist in Controller....");

		Set<ConstraintViolation<TerroristDto>> violations = service.saveAndValidate(dto);
		if(violations.isEmpty()) {
			System.out.println("data is saved "+dto);
			
			return "TerroristSuccess.jsp";
		}
		else {
			model.addAttribute("errors", violations);
			return "Terrorist.jsp";
		}		
	}
	
	@GetMapping("/search")
	public String serachById(@RequestParam int id, Model model) {
		System.out.println("running Search method...");
		TerroristDto dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");

		}
		return "TerroristSearch.jsp";
	}
}
