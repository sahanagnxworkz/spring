package com.xworkz.collection.boot;

import java.util.HashMap;
import java.util.Map;

public class ChocolateRunner {
	public static void main(String[] args) {
//price,flavour
		Map<Double, String> map = new HashMap<>();
		map.put(30d, "chocolate");
		map.put(20d,"vanilla");
		map.put(30d, "strawberry");
		map.put(50d, "chocolate");
		map.put(60d, "butterscotch");
		map.put(70d, "pista");

	}
}
