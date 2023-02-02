package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.form.ReceiveForm12;

@Controller
@RequestMapping("/ex12")
public class Ex12Controller {

	@GetMapping("/index")
	public String index(ReceiveForm12 receiveFrom12, Model model) {

		return "ex-12-register-member.html";
	}


	@PostMapping("/result")
	public String result(String name, String comment, ReceiveForm12 receiveForm, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("comment", comment);
	
		Member member = new Member();
		member.setAge(receiveForm.getAge());
		member.setMoney(receiveForm.getMoney());
		
		model.addAttribute("member", member);

		return "ex-12-register-member-output.html";
	}
}
