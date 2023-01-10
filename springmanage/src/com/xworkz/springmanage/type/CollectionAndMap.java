package com.xworkz.springmanage.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;

public class CollectionAndMap {
	@Bean
	public void collection() {
		Collection<String> collection = new ArrayList();
		collection.add("Sahana");
		collection.add("swati");
		collection.add("neelu");
		collection.add("swati");
		collection.add("neelu");

		collection.forEach(e -> System.out.println(e));
	}

	@Bean("map")
	public String map() {
		String ref=new String();
		Map<String, Double> map = new HashMap<>();
		map.put("Sahana", 22d);
		map.put("swati", 24d);
		map.put("neelu", 21d);
		map.put("nayana", 25d);
		map.put("vasundara", 23d);

		map.forEach((t, u) -> System.out.println(t + " " + u));
	return "mapping";
	}
}
