package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class FactorialService {

	public int getFactorial(int num) {
		return num = num * (num - 1) * (num - 2) * (num - 3) * (num - 4);
	}

}
