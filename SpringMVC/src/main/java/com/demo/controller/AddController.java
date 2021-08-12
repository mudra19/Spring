package com.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.services.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int t1,@RequestParam("t2") int t2) {
		AddService as = new AddService();
		int k=as.add(t1, t2);
		
		
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("result", k);
		
		return mv;
	}
	
}
