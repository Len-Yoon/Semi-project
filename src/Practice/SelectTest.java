package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/project?characterEncoding=utf8";
			conn = DriverManager.getConnection(url, "root", "root");
			stmt = conn.createStatement();
			String sql = "select * from board";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String board_id = rs.getString(1);
				String write = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				String rdate = rs.getString(5);
				
				System.out.println(board_id+" "+write+" "+title+" "+content+" "+rdate);
			}
		
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버 로딩 실패");
			
		} catch (SQLException e) {
			
			System.out.println("에러"+e);
			
		} finally {
			try {
				if( conn != null && !conn.isClosed()) {
					conn.close();
				}
				if( stmt != null&& !stmt.isClosed()) {
					stmt.close();
				}
				if( rs != null && rs.isClosed()) {
					rs.close();
				}
			}
			
			catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
