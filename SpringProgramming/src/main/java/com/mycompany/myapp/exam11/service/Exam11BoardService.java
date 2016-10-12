package com.mycompany.myapp.exam11.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam11.dao.Exam11BoardDao;
import com.mycompany.myapp.exam11.dto.Board;

@Component
public class Exam11BoardService {
	private static final Logger logger = LoggerFactory.getLogger(Exam11BoardService.class);
	
	@Autowired
	private Exam11BoardDao boardDao;
	
	public void insert(Board board) {
		logger.info("insert 처리");
		boardDao.insert(board);
	}
	
	

}
