package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FisrtProjApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=	SpringApplication.run(FisrtProjApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
	}

}
