package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {

		insert(1, "홍길동", "임시 제목", "임시 내용","2021-03-20");

	}

	private static void insert(int bno, String writer, String title, String content,String rdate) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/project?characterEncoding=utf8";

			conn = DriverManager.getConnection(url, "root", "root");
			
			String sql = "INSERT into board(writer, title, content) VALUES (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
	            pstmt.setString(1, writer);
	            pstmt.setString(2, title);
	            pstmt.setString(3, content);
	          
	            int count = pstmt.executeUpdate();
	            
	            if( count == 0) {
	            	
	            	System.out.println("데이터 입력 실패");
	            	
	            }else {
	            	
	            	System.out.println("데이터 입력 성공");
	            }
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버 로딩 실패");

		} catch (SQLException e) {
			
			System.out.println("에러" + e);
			
		}finally {
			
			try {
				
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
