package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.Questionnaire;
import com.example.demo.form.Ex17QuestionnaireForm;

@Controller
@RequestMapping("/ex17")
public class Ex17QuestionnaireController {

	@GetMapping("/index")
	public String index(Model model) {
		Map<Integer, String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");
		model.addAttribute("hobbyMap", hobbyMap);

		return "ex-17-input.html";
	}
	
	@PostMapping("/input-date")
	public String inputDate(Ex17QuestionnaireForm form, RedirectAttributes redirectAttributes) {
		Questionnaire questionnaire = new Questionnaire();
		BeanUtils.copyProperties(form, questionnaire);
		
		List <String>hobbyList = new ArrayList<>();
		for(Integer hobbyCode : form.getHobbyList()) {
			switch(hobbyCode) {
			case 1:
				hobbyList.add("野球");
				break;
				
			case 2:
				hobbyList.add("サッカー");
				break;
				
			case 3:
				hobbyList.add("テニス");
				break;
			}
		}
		questionnaire.setHobbyList(hobbyList);
		
		redirectAttributes.addFlashAttribute("questionnaire", questionnaire);
		return "redirect:/ex17/result-date";
	}
	@GetMapping("/result-date")
	public String resultDate() {
		return "ex-17-result.html";
	}

	
}
