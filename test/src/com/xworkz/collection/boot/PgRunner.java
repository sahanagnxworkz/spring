package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgRunner {
	public static void main(String[] args) {

		Map<Double, String> ref = new LinkedHashMap<>();
		ref.put(7000d, "roa");
		ref.put(2000d, "kushi");
		ref.put(4000d, "ladies");
		ref.put(6000d, "annapoorna");
		ref.put(7600d, "pooja");
		ref.put(4500d, "roa");

		Set<Double> keys = ref.keySet();
		System.out.println(keys);

		Collection<String> values = ref.values();
		System.out.println(values);

		// Entry<Double, String>
		Collection<Entry<Double, String>> map = ref.entrySet();
		System.out.println(map);
		
		
		for (Entry<Double, String> entry : map) {
			System.out.println(entry);
		}
	}
}
