package com.example.ChatBot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContoller {
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

}
