package com.dtdc.tracking.persona.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;  
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hello")
public class HelloController {
@GetMapping("/getmessage")	
	public String hello()
	{
		return "index";
	}

}
