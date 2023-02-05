package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.food.dto.FriutDTO;

@Component
@RequestMapping("/fruit")
public class FruitComponent {

	public FruitComponent() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onFruit(FriutDTO dto) {
		System.out.println("running on Fruit.....");
		System.out.println("details "+dto);
		return "Fruit.jsp";
	}
}
