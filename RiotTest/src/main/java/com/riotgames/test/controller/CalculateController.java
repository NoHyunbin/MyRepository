package com.riotgames.test.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riotgames.test.service.CalculateService;

@CrossOrigin
@Controller
public class CalculateController {
//	private static final Logger logger = LoggerFactory.getLogger(CalculateController.class);
	
	@Autowired
	private CalculateService calculateService; 
	
	@RequestMapping(value="/calculate", method=RequestMethod.GET)
	public String calculateGet() {
		//logger.info("calculate GET() 실행");
		return "calculate";
	}

	@RequestMapping(value="/calculate", method=RequestMethod.POST, consumes="application/x-www-form-urlencoded")
	@ResponseBody
	public String calculatePost(@RequestBody MultiValueMap<String,Object> params) {
		//logger.info("calculate POST() 실행");
		String result = "";
		for ( String key : params.keySet() ) {
			result = calculateService.calc(key);
		}
		
		return result;
	}
}