package com.springboot.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// dev andrew conflict
@RestController
@RequestMapping("/")
public class HelloController {
	
	@Value("${spring.datasource.url}")
	private String dbURL;
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("DB URL :: " + dbURL);
		
		return dbURL;
	}

}
