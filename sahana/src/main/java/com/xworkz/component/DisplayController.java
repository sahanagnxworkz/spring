package com.xworkz.component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BeverageDTO;
import com.xworkz.dto.ChatDTO;
import com.xworkz.dto.EducationDTO;
import com.xworkz.dto.FamilyDTO;
import com.xworkz.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {

	public DisplayController() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("running Email");
		model.addAttribute("email", "sahanagn.xworkz@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/number")
	public String onNumber(Model model) {
		System.out.println("running number");
		model.addAttribute("number", 9008284717l);
		return "index.jsp";
	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("running onAadhar");
		model.addAttribute("aadhar", 345678997d);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge");
		model.addAttribute("age", 22);
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDOB(Model model) {
		System.out.println("running DOB with time");
		model.addAttribute("dob", LocalDateTime.of(2000, 12, 03, 07, 30));
		return "index.jsp";
	}

	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("running DOB with time");
		model.addAttribute("salary", 456787d);
		return "index.jsp";
	}

	@GetMapping("/friends")
	public String onFriends(Model model) {
		System.out.println("running friends");
		List<String> list = new ArrayList();
		list.add("Sahana");
		list.add("swati");
		list.add("neelu");
		list.add("jothi");
		model.addAttribute("friends", list);
		return "index.jsp";
	}

	@GetMapping("/places")
	public String onPlaces(Model model) {
		System.out.println("running onPlaces");
		List<String> place = new ArrayList();
		place.add("mane");
		place.add("ShivGange");
		place.add("kotilingeshwara");
		model.addAttribute("places", place);
		return "index.jsp";
	}

	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("running onPlaces");
		List<String> skills = new ArrayList();
		skills.add("Java");
		skills.add("web Technologies");
		skills.add("Mysql");
		model.addAttribute("skill", skills);
		return "index.jsp";
	}

	@GetMapping("/education")
	public String onEducationDTO(Model model) {
		System.out.println("running education");
		EducationDTO dto = new EducationDTO();
		dto.setStudentName("Sahana");
		dto.setStudentLocation("bangalore");
		dto.setQualification("B.E");
		dto.setStream("CSE");
		dto.setSchoolname("EWCE");
		dto.setSchoolLocation("yelahanka");
		dto.setStudentAge(22);
		dto.setNumber(9235232545l);
		dto.setBacklogs(false);
		dto.setGraduate(true);
		model.addAttribute("studies", dto);
		return "index.jsp";
	}

	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("running family dto");
		FamilyDTO dto = new FamilyDTO("Sahana", "gangamma", "Giberu nilaya", "donnehalli", 9, 1, true, 3456343, true,
				true);
		model.addAttribute("family", dto);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("running on chats..");
		MobileDTO dto = new MobileDTO("OOPO", 23120, 4, "white&blue", true);
		model.addAttribute("phone", dto);
		return "index.jsp";
	}

	@GetMapping("/beverages")
	public String onBeverages(Model model) {
		System.out.println("running mobile...");
		BeverageDTO beverageDTO = new BeverageDTO("Coffee", "coffee", "bangalore", "manjula", 10, true,
				LocalDate.ofYearDay(2022, 12), LocalDate.of(2023, 3, 10));
		model.addAttribute("drinks", beverageDTO);
		return "index.jsp";
	}

	@GetMapping("/chat")
	public String onChats(Model model) {
		System.out.println("running on chats..");
		ChatDTO chatDTO = new ChatDTO("pani puri", "spicy", "bangarpete", "bangalore", "Rajajinagar 6th block", 10, 35,
				70, true, LocalDate.of(2022, 2, 7), LocalDate.of(2023, 3, 07));
		model.addAttribute("snacks", chatDTO);
		return "index.jsp";
	}

}
