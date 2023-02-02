package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receive")
public class ReceiveController {
	
	@GetMapping("/index")
	public String index() {
		return "info-form.html";
	}
	
	@PostMapping("/receive-info")
		public String receiveInfo(String name,String age){
		System.out.println("入力された名前は" + name);
		System.out.println("入力された年齢は" + age);
		return "finished.html";
	
	}

}
