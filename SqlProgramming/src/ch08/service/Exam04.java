package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam04 {
	
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		
		board.setBno(7);
		board.setBtitle("제목7");
		board.setBcontent("내용7");
		board.setBwriter("user7");
		board.setBhitcount(3);
		board.setBdate(new Date());
		dao.insert(board);
		
/*		
		for ( int i = 1 ; i < 10 ; i++ ) {
			board.setBno(i);
			board.setBtitle("제목"+i);
			board.setBcontent("내용"+i);
			board.setBwriter("user"+i);
			board.setBhitcount((int)(Math.random()*7));
			board.setBdate(new Date());
			dao.insert(board);
		}
*/	
	}

}
