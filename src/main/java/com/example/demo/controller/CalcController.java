package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CalcService;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private CalcService calcService;

	@GetMapping("/add")
	public String add() {
		int num1 = 2;
		int num2 = 3;

		int resultOfAdd = calcService.add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + resultOfAdd);
		return "finished.html";

	}

	@GetMapping("/sub")
	public String sub() {
		int num1 = 4;
		int num2 = 2;

		int resultOfSub = calcService.sub(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + resultOfSub);
		return "finished.html";
	}

	@GetMapping("/multi")
	public String multi() {
		int num1 = 2;
		int num2 = 3;

		int resultOfMulti = calcService.multi(num1, num2);
		System.out.println(num1 + "*" + num2 + "=" + resultOfMulti);
		return "finished.html";
	}

	@GetMapping("/div")
	public String div() {
		int num1 = 4;
		int num2 = 2;

		int resultOfDiv = calcService.div(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + resultOfDiv);
		return "finished.html";
	}

}
