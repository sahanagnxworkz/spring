package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CricketRunner {
	public static void main(String[] args) {

		Map<String, Double> map = new TreeMap<String, Double>((item1, item2) -> item2.compareTo(item1));
		map.put("virat", 250000d);
		map.put("dhoni", 29484d);
		map.put("siraj", 3204d);
		map.put("padikal", 2237d);
		map.put("bharath", 2378d);

	}
}
