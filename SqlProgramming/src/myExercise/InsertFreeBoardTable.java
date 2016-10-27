package myExercise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertFreeBoardTable {
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@106.253.56.123:1521:orcl", "kosauser14", "kosa12345");
			for ( int i = 1 ; i < 102 ; i++ ) {
				String sql = "insert into freeboard(bno, btitle, bcontent, bwriter, bhitcount, bdate) values(seq_freeboard_bno.nextval, ?, ?, 'user1', 0, sysdate)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "제목"+i);
				pstmt.setString(2, "내용"+i);
				int rowNo = pstmt.executeUpdate();
				pstmt.close();
			}
		} catch (Exception e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
}
