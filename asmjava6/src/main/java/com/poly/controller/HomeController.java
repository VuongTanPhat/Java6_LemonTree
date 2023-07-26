package com.poly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	@GetMapping({"/index", "/shop","/checkout","/cart","/contact","/detail"})
	public String index() {
	    return "index";
	}
	
}
