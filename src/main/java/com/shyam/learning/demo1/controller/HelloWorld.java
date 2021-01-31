package com.shyam.learning.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class HelloWorld {
	
	
	@GetMapping("/hello")
	public String hello() {
		
		System.out.println("Hello World");
		return "Hellow World - Welcome Shyam1";
		
	}

}
