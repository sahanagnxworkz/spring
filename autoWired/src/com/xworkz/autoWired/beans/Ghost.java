package com.xworkz.autoWired.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ghost {

	private String name;
	private String location;
	private String gender;
	private String ghostLocation;
	private String color;
	private String dressColor;
	private String deathType;
	private String deathplace;
	private String mothersName;
	private String fatherName;
	@Autowired
	@Qualifier("ghostEducation")
	private String education;
	@Autowired
	@Qualifier("ghostBest_frnd_name")
	private String best_frnd_name;
	@Autowired
	@Qualifier("ghostCollegeName")
	private String collegeName;
	@Autowired
	@Qualifier("ghostNumber")
	private long number;
	@Autowired
	@Qualifier("ghostHandNailLength")
	private double handNailLength;
	@Autowired
	@Qualifier("ghostLegNailLength")
	private double legNailLength;
	@Autowired
	@Qualifier("ghostIsGraduate")
	private boolean graduate;
	@Autowired
	@Qualifier("ghostNo_of_frnds")
	private double no_of_frnds;
	@Autowired
	@Qualifier("ghostDOB")
	private LocalDate DOB;
	@Autowired
	@Qualifier("ghostDOD")
	private LocalDate DOD;
	@Autowired
	@Qualifier("ghostPincode")
	private double pincode;

	@Autowired
	public Ghost(@Qualifier("ghostName") String name, @Qualifier("ghostLocation") String location,
			@Qualifier("ghostGender") String gender, @Qualifier("ghostPresentLocation") String ghostLocation,
			@Qualifier("ghostColor") String color, @Qualifier("ghostDressColor") String dressColor,
			@Qualifier("ghostDeathType") String deathType, @Qualifier("ghostDeathPlace") String deathplace,
			@Qualifier("ghostMotherName") String mothersName, @Qualifier("ghostFatherName") String fatherName) {
		super();
		this.name = name;
		this.location = location;
		this.gender = gender;
		this.ghostLocation = ghostLocation;
		this.color = color;
		this.dressColor = dressColor;
		this.deathType = deathType;
		this.deathplace = deathplace;
		this.mothersName = mothersName;
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", location=" + location + ", gender=" + gender + ", ghostLocation="
				+ ghostLocation + ", color=" + color + ", dressColor=" + dressColor + ", deathType=" + deathType
				+ ", deathplace=" + deathplace + ", mothersName=" + mothersName + ", fatherName=" + fatherName
				+ ", education=" + education + ", best_frnd_name=" + best_frnd_name + ", collegeName=" + collegeName
				+ ", number=" + number + ", handNailLength=" + handNailLength + ", legNailLength=" + legNailLength
				+ ", graduate=" + graduate + ", no_of_frnds=" + no_of_frnds + ", DOB=" + DOB + ", DOD=" + DOD
				+ ", pincode=" + pincode + "]";
	}
}
