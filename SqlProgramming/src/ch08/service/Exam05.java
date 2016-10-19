package ch08.service;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam05 {
	
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(8);
		board.setBtitle("8수정");
		board.setBcontent("8내용");
		
		dao.update(board);
	}

}
