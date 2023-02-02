package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User1;
import com.example.demo.form.ReceiveForm10;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex10")
public class Ex10Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("/index")
	public String index(ReceiveForm10 receiveForm10) {

		return "ex-10-input.html";
	}

//	@PostMapping("/input-date")
//	public String inputDate(String name, String age, String comment) {
//		User user = new User();
//		user.setName(name);
//		user.setAge(Integer.parseInt(age));
//		user.setComment(comment);
//
//		session.setAttribute("user", user);
//
//		return "ex-10-output.html";
		
		@PostMapping("/input-date")
		public String inputDate( ReceiveForm10 receiveForm10) {
		
			User1 user = new User1();
			user.setName(receiveForm10.getName());
			user.setAge(receiveForm10.getIntAge());
//			user.setAge(receiveForm10.getAge());
			user.setComment(receiveForm10.getComment());

			session.setAttribute("user", user);

			return "ex-10-output.html";

	}

	@GetMapping("/output")
	public String output() {
		return "ex-10-output.html";
	}

	@GetMapping("/output2")
	public String output2() {
		return "ex-10-output2.html";
	}

}
