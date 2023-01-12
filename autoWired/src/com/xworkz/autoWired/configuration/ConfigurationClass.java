package com.xworkz.autoWired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.autoWired.beans.Engine;
import com.xworkz.autoWired.beans.NewsPaper;
import com.xworkz.autoWired.beans.Snakes;

@Configuration
@ComponentScan("com.xworkz.autoWired")
public class ConfigurationClass {
	@Bean("newsPaperId")
	public int id() {
		System.out.println("registering id...");
		return 10;
	}

	@Bean("newsPaperName")
	public String newsPaperName() {
		System.out.println("registering newsPaperName...");
		return "prajaVani";
	}

	@Bean("newsPaperOwnerName")
	public String newsPaperOwnerName() {
		System.out.println("registering newsPaperOwnerName...");
		return "Sahana";
	}

	@Bean("newsPaperLang")
	public String newsPaperLang() {
		System.out.println("registering newsPaperLang...");
		return "Kannda";
	}

	@Bean("newsPaperPrice")
	public double newsPaperPrice() {
		System.out.println("registering newsPaperPrice...");
		return 4.5;
	}

	@Bean
	public NewsPaper dinaPatrikke() {
		System.out.println("Register another instance of Newspaper");
		return new NewsPaper();
	}

	@Bean("snakeName")
	public String snakeName() {
		System.out.println("registering snakeName...");
		return "Cobra";
	}

	@Bean("snakeLength")
	public double snakeLength() {
		System.out.println("registering snakeLength...");
		return 19.2;
	}

	@Bean("snakeColor")
	public String snakeColor() {
		System.out.println("registering snakeColor...");
		return "Black";
	}

	@Bean("snakeType")
	public String snakeType() {
		System.out.println("registering snakeType...");
		return "veg";
	}

	@Bean("snakePoisionous")
	public boolean snakePoisionous() {
		System.out.println("registering snakePoisionous...");
		return false;
	}

	@Bean("snake1")
	public Snakes snake1() {
		System.out.println("Register another instance of Snake");
		return new Snakes("python", "Non Veg", false);
	}

	@Bean("engineName")
	public String engineName() {
		System.out.println("registering Engine name...");
		return "TATA";
	}

	@Bean("engineType")
	public String engineType() {
		System.out.println("registering Engine engineType...");
		return "CombutionEngine";
	}

	@Bean("engineLength")
	public double engineLength() {
		System.out.println("registering Engine engineLength...");
		return 29;
	}

	@Bean("engineVersion")
	public String engineVersion() {
		System.out.println("registering Engine engineLength...");
		return "2.43.4";
	}

	@Bean("engineCompany")
	public String engineCompany() {
		System.out.println("registering Engine engineCompany...");
		return "TATA";
	}

	@Bean("engineStrokes")
	public String engineStrokes() {
		System.out.println("registering Engine engineStrokes...");
		return "Compression";
	}

	@Bean("machine")
	public Engine machine() {
		return new Engine("", null, null);
	}

	@Bean("ghostName")
	public String ghostName() {
		return "Abc";
	}

	@Bean("ghostLocation")
	public String ghostLocation() {
		return "home";
	}

	@Bean("ghostGender")
	public String ghostGender() {
		return "not disclose";
	}

	@Bean("ghostPresentLocation")
	public String ghostPresentLocation() {
		return "Ghat";
	}

	@Bean("ghostColor")
	public String ghostColor() {
		return "White";
	}

	@Bean("ghostDressColor")
	public String ghostDressColor() {
		return "White";
	}

	@Bean("ghostDeathType")
	public String ghostDeathType() {
		return "heartAttack";
	}

	@Bean("ghostDeathPlace")
	public String ghostDeathPlace() {
		return "Hospital";
	}

	@Bean("ghostMotherName")
	public String ghostMotherName() {
		return "DEF-XYZ";
	}

	@Bean("ghostFatherName")
	public String ghostFatherName() {
		return "XYZ";
	}

	@Bean("ghostEducation")
	public String education() {
		return "law";
	}

	@Bean("ghostBest_frnd_name")
	public String ghostBest_frnd_name() {
		return "mnop";
	}

	@Bean("ghostCollegeName")
	public String ghostCollegeName() {
		return "IJKL";
	}

	@Bean("ghostNumber")
	public long ghostNumber() {
		return 983456789l;
	}

	@Bean("ghostHandNailLength")
	public double ghostHandNailLength() {
		return 5;
	}

	@Bean("ghostLegNailLength")
	public double ghostLegNailLength() {
		return 2;
	}

	@Bean("ghostIsGraduate")
	public boolean ghostIsGraduate() {
		return true;
	}

	@Bean("ghostNo_of_frnds")
	public double ghostNo_of_frnds() {
		return 298;
	}

	@Bean("ghostDOB")
	public LocalDate ghostDOB() {
		return LocalDate.of(1956, 10, 10);
	}

	@Bean("ghostDOD")
	public LocalDate ghostDOD() {
		return LocalDate.of(2021, 06, 23);
	}

	@Bean("ghostPincode")
	public double ghostPincode() {
		return 568387;
	}
}
