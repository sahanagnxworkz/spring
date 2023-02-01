package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodComponet {

	public FoodComponet() {
		System.out.println("running FoodComponet");
	}

	@PostMapping
	public String taste(@RequestParam String name,@RequestParam String type
			,@RequestParam int price,@RequestParam int quantity) {
	
		System.out.println("running on post method");
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(quantity);
		return "Food.jsp";
		
	}

}
