package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam03 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

		// 매개변수화된 SQL문(select문)
		String sql = "";
		sql += "select empno, ename, (sal*12+nvl(comm, 0)) as yearsal from emp ";
		sql += "where sal>? and deptno=? ";
		sql += "order by yearsal desc";
		PreparedStatement pstmt = conn.prepareStatement(sql);		// 실행 준비 완료된 객체로 만들어줌
		pstmt.setInt(1, 400);
		pstmt.setInt(2, 30);
		ResultSet rs = pstmt.executeQuery();
		
		while ( rs.next() ) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			int sal = rs.getInt("yearsal");
			System.out.println(empno + " | " + ename + " | " + sal);			
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
	}

}
