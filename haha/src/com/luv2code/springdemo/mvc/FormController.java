package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "main-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "answer";
	}
	
}
