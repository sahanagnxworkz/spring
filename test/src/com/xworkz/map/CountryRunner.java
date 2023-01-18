package com.xworkz.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountryRunner {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap();
		map.put("India", "Draupadi Murmu");
		map.put("China", "Xi Jinping");
		map.put("Kazakhstan", "Qasym");
		map.put("Saudi Arabia", "Salman");
		map.put("Iran", "Hassan Rouhani");
		map.put("Mongolia", "Battulga");
		map.put("Afghanistan", "Mohammad ");
		map.put("Yemen", "Abdrabbuh");
		map.put("Thailand", "Maha Vajiralongkorn");
		map.put("Turkmenistan", "Gurbanguly");
		map.put("Iraq", "Barham");
		map.put("Japan", "Naruhito");
		map.put("Philippines", "Duterte");
		map.put("Bangladesh", "Abdul ");
		map.put("North Korea", "Kim Jong-un");
		map.put("Oman", "Sultan");
		map.put("Egypt", "Abdel");
		map.put("Bhutan", "Jigme");
		map.put("Taiwan", "Tsai");
		map.put("Armenia", "Armen ");

		System.out.println("size of map :" + map.size());
		System.out.println("printing in ascending order....");
		map.forEach((e1, e2) -> System.out.println("Country name :" + e1 + " and the president name " + e2));
		System.out.println("getting name i.e characters> 10");
		map.forEach((e1, e2) -> {
			if (e1.length() > 10) {
				System.out.println(e1);
			}
		});

	}
}
