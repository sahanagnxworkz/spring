package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.xworkz.collection.constant.Type;
import com.xworkz.collection.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {

		List<WeaponDTO> collection = new ArrayList<>();
	
		
		collection.add(new WeaponDTO("Big Bertha", "India", LocalDate.ofYearDay(2022, 12), 1000, Type.artillery));
		collection.add(new WeaponDTO("yellow rain", "USA", LocalDate.ofYearDay(2000, 12), 100, Type.semiautomatic));
		collection.add(new WeaponDTO("bow and arrow", "japan", LocalDate.ofYearDay(1933, 12), 14000, Type.combat));
		collection.add(new WeaponDTO("grapeshot", "china", LocalDate.ofYearDay(1982, 1), 1200, Type.siege));
		collection.add(new WeaponDTO("sword", "ukraine", LocalDate.ofYearDay(1980, 3), 10040, Type.firearms));
		collection.add(new WeaponDTO("dagger", "russia", LocalDate.ofYearDay(1933, 12), 10050, Type.rockets));
		collection.add(new WeaponDTO("nerve gas", "nepal", LocalDate.ofYearDay(1983, 12), 1500, Type.chemical));
		collection.add(new WeaponDTO("depth charge", "srilanka", LocalDate.ofYearDay(2022, 12), 14000, Type.ranged));
		collection.add(new WeaponDTO("grenade", "afghanisthan", LocalDate.ofYearDay(1943, 12), 1090, Type.rockets));
		collection.add(new WeaponDTO("antiballistic", "Austriala", LocalDate.ofYearDay(1987, 12), 1300, Type.missiles));
		collection.add(new WeaponDTO("Polaris", "India", LocalDate.ofYearDay(1999, 12), 1007, Type.automatic));
		collection.add(new WeaponDTO("V-2 missile", "nepal", LocalDate.ofYearDay(1867, 12), 15000, Type.artillery));
		collection.add(new WeaponDTO("Congreve rocket", "southAfrica", LocalDate.ofYearDay(1898, 12), 21000,
				Type.semiautomatic));
		collection.add(
				new WeaponDTO("gunblunderbuss", "northAfrica", LocalDate.ofYearDay(1988, 12), 10300, Type.explosives));
		collection.add(new WeaponDTO("air gun", "India", LocalDate.ofYearDay(1998, 12), 1200, Type.rockets));
		collection.add(
				new WeaponDTO("hydrogen cyanide", "manipuri", LocalDate.ofYearDay(1980, 12), 71000, Type.chemical));
		collection.add(new WeaponDTO("Garand rifle", "russia", LocalDate.ofYearDay(2022, 12), 10400, Type.ranged));
		collection.add(new WeaponDTO("pistol", "america", LocalDate.ofYearDay(1980, 12), 800, Type.rockets));
		collection.add(new WeaponDTO("hand gun", "India", LocalDate.ofYearDay(2022, 12), 10004, Type.artillery));
		collection.add(new WeaponDTO("revolver", "russia", LocalDate.ofYearDay(1980, 12), 10500, Type.semiautomatic));
		collection.add(new WeaponDTO("rifle", "austrailia", LocalDate.ofYearDay(1980, 12), 13000, Type.explosives));
		// System.out.println(collection.size());
		System.out.println("weapon greather than 10000");

//		collection.stream().sorted().filter(e -> e.getName().compareTo("India")).collect(Collectors.toList())
//				.forEach(e -> System.err.println(e));
		collection.stream().filter(ele -> ele.getPrice() > 10000).forEach(e -> System.out.println(e));
		System.out.println("----------------------------------------------------------");
//		collection.stream().
//				.forEach(e -> System.out.println("made by " + e.getMadeBy() + "--->made on " + e.getMadeOn()));

		System.out.println("------------printing names in desc-------------------------------------");

		Comparator<WeaponDTO> comparator = ((e1, e2) -> e2.getName().compareToIgnoreCase(e1.getName()));

		collection.stream().sorted(comparator).forEach(e -> System.out.println(e));
		System.err.println("-----------34567890-=--------------------------------------------------");
		Comparator<WeaponDTO> comparator1 = ((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()));
		collection.stream().sorted(comparator1).forEach(e -> System.out.println(e));
		System.err.println("----------------------------------MADE ON----------------------------------------------");
		Comparator<WeaponDTO> madeOn = ((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()));
		collection.stream().sorted(madeOn).forEach(e -> System.out.println(e));
		System.err.println("------------------------Price on incresing order---------------------------------");
		Comparator<WeaponDTO> price = ((e1, e2) -> Double.compare(e1.getPrice(), e2.getPrice()));
		collection.stream().sorted(price).forEach(e -> System.out.println(e));

		System.err.println("------------------------------Price on desc order------------------------------------");
		Comparator<WeaponDTO> pricedesc = ((e1, e2) -> Double.compare(e2.getPrice(), e1.getPrice()));
		collection.stream().sorted(pricedesc).forEach(e -> System.out.println(e));

		System.err.println("-----------------------------------name & madeOn asce order---------------------------");
		Comparator<WeaponDTO> sort1 = ((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
		Comparator<WeaponDTO> sort2 = ((e1, e2) -> e1.getMadeBy().compareToIgnoreCase(e2.getMadeBy()));

		collection.stream().sorted(sort1).filter(e -> e.getName().equalsIgnoreCase(e.getName())).sorted(sort2)
				.filter(e -> e.getMadeBy().equalsIgnoreCase(e.getMadeBy())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

//	collection.stream().filter((e1)->e1.getName().compareTo(e1.getName());
		// Collections.sort(WeaponDTO);
	}
}
