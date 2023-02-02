package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Ex01Controller {
	
	@GetMapping("/show-name")
	public String shoName() {
		
		return "ex-01.html";
		
	}

}
