package ch08.service;

import ch08.dao.BoardDao;

public class Exam06 {
	
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		dao.deleteByBno(8);	
/*		
		for ( int i = 1 ; i < 10 ; i++ ) {
			dao.deleteByBno(i);	
		}		
*/		
	}

}
