package com.bestcxx.stu.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Springi18nController{
	
	@GetMapping("/index")
	public String login(){
		return "index";
	}

}
