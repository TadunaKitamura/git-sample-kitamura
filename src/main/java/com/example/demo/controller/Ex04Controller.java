package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@GetMapping("/index")
	public String index() {
		return"ex-04.html";
	}
		
	@PostMapping("/login")
	public String login(String email, String pass) {
		if("abc@gmail.com".equals(email) && "abc".equals(pass)) {
			return "ex-04-success.html";
		}else {
			return "ex-04-failure.html";
			
		}
	
		
	}
		
		
		
	

}
