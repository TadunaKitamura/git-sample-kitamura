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

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/index")
	public String index(Model model) {

		Map<Integer, String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");

		model.addAttribute("hobbyMap", hobbyMap);
		return "user/input.html";

	}

	@PostMapping("/create")
	public String create(UserForm form, RedirectAttributes redirectAttributes) {
		
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		List<String> hobbyList = new ArrayList<>();
		for(Integer hobbyCode : form.getHobbyList()) {
			switch(hobbyCode){
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
		user.setHobbyList(hobbyList);
		

	UserService userService = new UserService();
	user=userService.save(user);
	
	redirectAttributes.addFlashAttribute("user",user);
	
	return "redirect:/user/toresult";

}

	@GetMapping("/toresult")
	public String toresult() {
		return "user/result.html";
	}
}
