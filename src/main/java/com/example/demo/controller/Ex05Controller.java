package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex05")
public class Ex05Controller {
	
	@GetMapping("/index")
	public String index() {
		return "ex-05.html";
	}
	
	
	@PostMapping("/receive-hobby")
	public String receiveHobby(String hobby) {
		System.out.println(hobby);
		return "finished.html";
	}
	
	
	

}
