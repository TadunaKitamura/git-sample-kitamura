package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.FactorialService;

@Controller
@RequestMapping("/factorial")
public class FactorialController {

	@Autowired
	private FactorialService factorialService;

	@GetMapping("/view-result")
//	public String viewResult(Model model) {
//	model.addAttribute("result", factorialService.getFactorial(5));

	public String viewResult(Model model) {
		int num = 5;
		int result = factorialService.getFactorial(num);
		model.addAttribute("result", result);
		System.out.println(result);

		return "factorial-view.html";

	}

}
