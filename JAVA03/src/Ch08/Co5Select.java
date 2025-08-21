package Ch08;

import java.sql.Connection;				// DB 연결 객체
import java.sql.DriverManager;			// DB 접속을 도와주는 클래스
import java.sql.PreparedStatement;		// SQL문을 DB에 전달할 때 사용하는 객체
import java.sql.ResultSet;				// SELECT 결과(테이블의 행, 열 데이터)를 담는 객체
import java.sql.SQLException;			// SQL 실행 도중 발생하는 예외를 처리하기 위한 클래스

public class Co5Select {

	public static void main(String[] args) {
		String id = "root";		// DB의 id
		String pw = "1234";		// DB의 PW
		String url = "jdbc:mysql://localhost:3306/opendatadb";	// 자바:DBMS종류://저장소위치/테이블이름 

		Connection conn = null;				// DBMS의 특정 DB와 연결되는 객체, DB 연결 다리 역할
		PreparedStatement pstmt = null;		// SQL Query 전송용 객체, SQL을 실행할 때 쓰는 객체
		ResultSet rs = null;				// select 결과를 담을 객체, SELECT 결과를 받아 저장하는 객체
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");				// Class.forName() 메서드, MySQL JDBC 드라이버 클래스를 JVM에 로드
		System.out.println("Driver Loadeing Success...");
		conn = DriverManager.getConnection(url,id,pw);			// 실제 DB와 연결
		System.out.println("DB CONNECTED...");
		//sql query 객체 생성
		pstmt = conn.prepareStatement("SELECT * FROM tbl_a");	// prepareStatement()DB에 보낼 SQL문 준비
		
		rs = pstmt.executeQuery();		// 실제 SQL이 DB에 전달되었는 결과가 rs에 담김
		
		if(rs != null) {
			while(rs.next()) {			// rs의 데이터(행)가 있으면 계속 밑의 코드 반복
				System.out.print(rs.getInt("no")+ ".");
				System.out.println(rs.getString("name"));
			}
		}
		
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
			e2.printStackTrace();
		}finally {
			
			try {rs.close();}catch(SQLException e) {e.printStackTrace();}			// 나중에 넣은 순서대로 닫아주기
			try {pstmt.close();}catch(SQLException e) {e.printStackTrace();}
			try {conn.close();}catch(SQLException e) {e.printStackTrace();}
		}
	}

}
