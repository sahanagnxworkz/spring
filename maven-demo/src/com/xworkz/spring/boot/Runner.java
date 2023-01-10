package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.configration.SpringConfiguration;
import com.xworkz.spring.type.Book;
import com.xworkz.spring.type.Bus;
import com.xworkz.spring.type.Charger;
import com.xworkz.spring.type.Chocolate;
import com.xworkz.spring.type.Ghee;
import com.xworkz.spring.type.Milk;
import com.xworkz.spring.type.Pen;
import com.xworkz.spring.type.Pencil;
import com.xworkz.spring.type.Pillow;
import com.xworkz.spring.type.Road;
import com.xworkz.spring.type.TShirt;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bus bus = applicationContext.getBean(Bus.class);
		System.out.println(bus.name());
		Road road = applicationContext.getBean(Road.class);
		Milk milk = applicationContext.getBean(Milk.class);
		Pillow pillow = applicationContext.getBean(Pillow.class);
		Pen pen = applicationContext.getBean(Pen.class);
		Pencil pencil = applicationContext.getBean(Pencil.class);
		Chocolate chocolate = applicationContext.getBean(Chocolate.class);
		Book book = applicationContext.getBean(Book.class);
		TShirt shirt = applicationContext.getBean(TShirt.class);
		Charger charger = applicationContext.getBean(Charger.class);
		Ghee ghee = applicationContext.getBean(Ghee.class);
	}

}
