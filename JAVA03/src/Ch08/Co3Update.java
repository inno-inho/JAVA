package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Co3Update {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";	// 자바:DBMS종류://저장소위치/테이블이름 

		Connection conn = null;				// DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null;		// SQL Query 전송용 객체
		ResultSet rs = null;				// select 결과를 담을 객체
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");				// Class.forName() 메서드
		System.out.println("Driver Loadeing Success...");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED...");
		//sql query 객체 생성
		pstmt = conn.prepareStatement("insert into tbl_a values(?, ?)");
		pstmt.setInt(1, Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		// sql를 dbms로 전달
		int result = pstmt.executeUpdate();
		
		// 결과값으로 java에서 처리
		if(result > 0) 
			System.out.println("INSERT 성공");
		else
			System.out.println("INSERT 실패");
		
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
			e2.printStackTrace();
		}finally {
			try {conn.close();}catch(SQLException e) {e.printStackTrace();}
		}
	}

}
