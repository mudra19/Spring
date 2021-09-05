package com.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.TodoDao;
import com.entities.ToDo;

@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;
	
	@Autowired
	TodoDao todoDao;
	
	@RequestMapping("/home")
	public ModelAndView getHome() {
		
		ModelAndView mv = new ModelAndView();
		//List<ToDo> list= (List<ToDo>) context.getAttribute("list");
	   // List<ToDo>	list = todoDao.getAllTodo();
		//mv.addObject("todos", list);
		String str="home";
		mv.addObject("page", str);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView addTodo() {
		
		ModelAndView mv = new ModelAndView();
		ToDo t= new ToDo();
    	String str="add";
		mv.addObject("page", str);
	    mv.addObject("todo", t);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") ToDo t,Model m) {
		t.setTodoDate(new Date());
		List<ToDo> list= (List<ToDo>) context.getAttribute("list");
		list.add(t);
		todoDao.saveTodo(t);
		m.addAttribute("msg", "successfully added");
		return "home";
	}

}
