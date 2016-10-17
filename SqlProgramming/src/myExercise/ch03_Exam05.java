package myExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch03_Exam05 {
	
	public static void main(String[] args) throws Exception {	
		Class.forName("oracle.jdbc.OracleDriver");
		Scanner scanner = new Scanner(System.in);
		
		while ( true ) {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "kosa12345");					
			String sql = "select employee_id, first_name from employees where lower(first_name) like ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);		// 실행 준비 완료된 객체로 만들어줌
			System.out.print("검색할 이름 : ");
			String name = scanner.nextLine();
			
			if ( name.equals("99") ) {
				pstmt.close();
				conn.close();
				break;
			}
			
			pstmt.setString(1, "%" + name + "%");
			ResultSet rs = pstmt.executeQuery();
			
			if ( rs.next() ) {
				do { 
					int employee_id = rs.getInt("employee_id");
					String first_name = rs.getString("first_name");
					System.out.println(employee_id + " | " + first_name);
				} while( rs.next() );
			} else {
				System.out.println(name + "을 포함한 이름이 없음");			
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		}		
		System.out.println("프로그램 종료");			

	}
}

