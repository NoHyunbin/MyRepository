package com.mycompany.myapp.exam11.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam11.dto.Board;

@Component
public class Exam11BoardDao {
	private static final Logger logger = LoggerFactory.getLogger(Exam11BoardDao.class);
	
	public void insert(Board board) {
		logger.info("insert 처리");
		logger.info("bwriter : " + board.getBwriter());
		logger.info("btitle : " + board.getBtitle());
		logger.info("bcontent : " + board.getBcontent());
	}
	

}
