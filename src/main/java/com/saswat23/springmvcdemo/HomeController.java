package com.saswat23.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@ModelAttribute("entityName")
	public String getDataType() {
		return "User";
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Inside home()");
		return "index";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		System.out.println("Inside addStudent()");
		return "result";
	}
}
