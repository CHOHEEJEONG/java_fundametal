package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		//1. 드라이버 로드한다.
		//Class.forName(패키지명);
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버로드 실패 : " + e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터베이스와 연결하는 connection 객체를 생성한다.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", //url
					"kpc12", //user
					"kpc1212"); //password
			System.out.println("데이터베이스 연결 성공");
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 설정하기
			pstmt.setInt(1,11);
			pstmt.setString(2, "두테르테");
			pstmt.setString(3, "필리핀");
			
			//5. SQL문을 전송한다.
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null)	con.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
