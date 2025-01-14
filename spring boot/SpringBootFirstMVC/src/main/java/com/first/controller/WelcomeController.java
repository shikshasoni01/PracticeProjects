package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String display()
	{
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
}
