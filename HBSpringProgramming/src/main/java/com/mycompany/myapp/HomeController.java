package com.mycompany.myapp;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String index() { 
		logger.info("home() 실행"); 
		return "index";
	}
	
	@RequestMapping("/news")
	public String news() {
		logger.info("news() 실행");
		return "news";
	}
	
}
