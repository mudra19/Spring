package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AlienController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("inside controller");
		return "home";
	}
	

}
