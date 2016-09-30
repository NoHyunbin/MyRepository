package com.mycompany.myapp.exam04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam04/index";		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String writeForm() {
		logger.info("writeForm 요청 처리");
		return "exam04/writeform";		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Board board) {
		logger.info("write 요청 처리");
		logger.info("bcategory : " + board.getBcategory());
		logger.info("bno : " + board.getBno());
		logger.info("btitle : " + board.getBtitle());
		logger.info("bcontent : " + board.getBcontent());
		logger.info("bwriter : " + board.getBwriter());
		logger.info("bhitcount : " + board.getBhitcount());
		return "exam04/index";
	}

}
