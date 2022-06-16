package com.training.jenkinsdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
	
	@RequestMapping("/msg")
	public String message() {
		return "Hello from SpringB 2.0";
	}

}
