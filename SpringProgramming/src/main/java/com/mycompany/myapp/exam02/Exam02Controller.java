package com.mycompany.myapp.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/exam02")
public class Exam02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam02/index";
	}
/*	
	@RequestMapping("/join")
	public String join(String mid, String mname, String mage) {
		logger.info("join 요청 처리");
		logger.info("mid \t: " + mid);
		logger.info("mname \t: " + mname);
		logger.info("mage \t: " + mage);
		return "exam02/index";
	}
*/
	@RequestMapping("/join")
	public String join(Member member) {
		logger.info("join 요청 처리");
		logger.info("mid \t: " + member.getMid());
		logger.info("mname \t: " + member.getMname());
		logger.info("mage \t: " + member.getMage());
		return "exam02/index";
	}
	
	@RequestMapping("/login")
	public String login(
		@RequestParam("id") String mid,
		@RequestParam("password") String mpassword) {
		
		logger.info("login 요청 처리");
		logger.info("mid \t: " + mid);
		logger.info("mpassword \t: " + mpassword);
		return "exam02/index";
	}
	
	@RequestMapping("/order")
	public String order(String pid, String pname, String pprice, String pcompany) {
		logger.info("order 요청 처리");
		logger.info("pid \t: " + pid);
		logger.info("pname \t: " + pname);
		logger.info("pprice \t: " + pprice);
		logger.info("pcompany \t: " + pcompany);		
		return "exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(@RequestParam(defaultValue="1")int bno,
							String title, String content,
							@RequestParam(defaultValue="0")int hitcount) {
		logger.info("write 요청 처리");
		logger.info("bno \t: " + bno);
		logger.info("title \t: " + title);
		logger.info("content \t: " + content);
		logger.info("hitcount \t: " + hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam(defaultValue="1")int bno,
							String title, String content,
							@RequestParam(value="count", defaultValue="0")int hitcount) {
		logger.info("update 요청 처리");
		logger.info("bno \t: " + bno);
		logger.info("title \t: " + title);
		logger.info("content \t: " + content);
		logger.info("hitcount \t: " + hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/send")
	public String send(Board board) {
		logger.info("send 요청 처리");
		logger.info("bno \t: " + board.getBno());
		logger.info("title \t: " + board.getTitle());
		logger.info("content \t: " + board.getContent());
		logger.info("hitcount \t: " + board.getHitcount());
		return "exam02/index";
	}
	
}
