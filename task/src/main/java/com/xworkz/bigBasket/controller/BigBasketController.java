package com.xworkz.bigBasket.controller;

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

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.service.BigBasketService;

@Controller
@RequestMapping("/bigbasket")
public class BigBasketController {
	@Autowired
	private BigBasketService basketService;
	private List<String> itemNames = Arrays.asList("bisuit", "kurkure", "masala powder", "maggi", "sugar", "salt");
	private List<String> locations = Arrays.asList("bangalore", "mysore", "ilkal", "davanagere", "chitradurga");

	public BigBasketController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onBigBasket(Model model) {
		System.out.println("running on get method..");

		model.addAttribute("itemsList", itemNames);
		model.addAttribute("location", locations);

		return "BigBasket.jsp";
	}

	@PostMapping
	public String onBigBasket(Model model, BigBasketDTO basketDTO) {
		System.out.println("running on get method.." + basketDTO);
		Set<ConstraintViolation<BigBasketDTO>> violations = this.basketService.validateAndSave(basketDTO);
		if (violations.isEmpty()) {
			System.out.println("no valiation..." + basketDTO);
			
			return "BigBasketSuccess.jsp";
		} else {

			model.addAttribute("itemsList", itemNames);
			model.addAttribute("location", locations);
			model.addAttribute("errors", violations);
			return "BigBasket.jsp";
		}

	}
}
