package com.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.ToDo;

public class MyListener implements  ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
       
		System.out.println("context created..");
		
		List<ToDo> list =new ArrayList<ToDo>();
		ServletContext context = arg0.getServletContext();
		context.setAttribute("list", list);
		
		
	}

}
