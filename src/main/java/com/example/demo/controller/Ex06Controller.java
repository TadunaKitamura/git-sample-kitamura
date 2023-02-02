package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm06;

@Controller
@RequestMapping("/ex06")
public class Ex06Controller {
	
//	@GetMapping("/index")
//	public String index() {
//		
//		return "ex-06.html";
//	}
//	
//	@PostMapping("/receive-info")
//	public String receiveInfo(String name ,String age,String commenr) {
//		Sysout()
	
//		return "finished.html";
		
		
		
	@GetMapping("/index")
	public String index(ReceiveForm06 receiveForm) {
	return "info-form06.html";
		
	}

	@PostMapping("/receive-info")
	public String receiveInfo(ReceiveForm06 receiveForm) {
		return "finished.html";
	}

	
}
