package com.xworkz.map;

import java.util.Map;
import java.util.TreeMap;

public class MobileRunner {
	public static void main(String[] args) {

		Map<String, Double> mobile = new TreeMap<String,Double>((name,name2)->name2.compareTo(name));
		mobile.put("Oppo", 435678d);
		mobile.put("Mi", 5678823d);
		mobile.put("Oppo", 562023d);
		mobile.put("redmi", 12000d);
		mobile.put("vivo", 20000d);
		mobile.put("Samsung", 435678d);
		mobile.put("motorola", 354276d);
		mobile.put("nokia", 9000d);
		mobile.put("honor", 80000d);
		mobile.put("poco", 34526d);

	mobile.forEach((e1,e2)->System.out.println(e1 + "  "+e2));
	System.out.println("to uppercase");
		mobile.forEach((e1, e2) -> {
			e1 = e1.toUpperCase();
			System.out.println(e1);
		});
		System.out.println("printing price is greater than 50000");
		mobile.forEach((e1, e2) -> {
			if (e2 > 50000) {
				System.out.println(e2);
			}
		});

		System.out.println("-----printing charcter < 5------");
		mobile.forEach((e1, e2) -> {
			if (e1.length() < 5) {
				System.out.println(e1);
			}
		});
		
		System.out.println("----------------------------");
		
	}
}
