package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm09;

@Controller
@RequestMapping("/ex09")
public class Ex09Controller {

//	@GetMapping("/index")
//	public String index() {
//		return "ex-09.html";
//
//	}
//
//	@PostMapping("/input-date")
//	public String inputDate(String email, String pass, Model model) {
//
//		if ("abc@gmail.com".equals(email) && "abc".equals(pass)) {
//			model.addAttribute("result", "成功");
//
//		} else {
//			model.addAttribute("result", "失敗");
//
//		
//		}
//		return "ex-09-result.html";
//	}
//}

//	フォームオブジェクト使用
	@GetMapping("/index")
	public String index(ReceiveForm09 receiveForm) {
		return "ex-09.html";

	}

	@PostMapping("/input-date")
	public String inputDate(ReceiveForm09 receiveForm, Model model) {

		if ("abc@gmail.com".equals(receiveForm.getEmail()) && "abc".equals(receiveForm.getPass())) {
			model.addAttribute("result", "成功");

		} else {
			model.addAttribute("result", "失敗");

		}
		return "ex-09-result.html";

	}
}

