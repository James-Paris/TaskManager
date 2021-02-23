package com.hcl.taskmanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcl.taskmanager.model.User;


@Controller
public class MainController {

	private Logger log = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/register")
	public String getRegistration(ModelMap model) {
		return "register";
	}
	
	@GetMapping("/login")
	public String getLogin(ModelMap model) {
		return "login";
	}
	
	@PostMapping("/register")
	public String postRegistration(ModelMap model, User user) {
		log.info("Registerin user: " + user.toString());
		
		
		return "";
	}
}
