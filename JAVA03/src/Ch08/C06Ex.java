package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06Ex {

	public static void main(String[] args) {
		
		//00.charge_station.sql 을 dbms 에 복원하세요(opendatadb.tbl_charge)
		
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loading success...");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB connected...");
		
		//01.tbl_charge에 insert 코드 실행
//		pstmt = conn.prepareStatement("insert into tbl_charge values(?, ?, ?, ?, ?, ?)");
//		pstmt.setInt(1, Integer.parseInt(args[0]));
//		pstmt.setString(2, args[1]);
//		pstmt.setString(3, args[2]);
//		pstmt.setString(4, args[3]);
//		pstmt.setInt(5, Integer.parseInt(args[4]));
//		pstmt.setString(6, args[5]);
//		
//		int result = pstmt.executeUpdate();
//		System.out.println("result: " + result );
//		
//		if(result > 0) {
//			System.out.println("insert success");
//		}else {
//			System.out.println("insert unsuccess");
//		}
		
		//02.tbl_charge에 update 코드 실행
//		pstmt = conn.prepareStatement("update tbl_charge set 행정구역 = ? where 시설명 =?");
//		
//		pstmt.setString(1, args[0]);
//		pstmt.setString(2, args[1]);
//		
//		int result = pstmt.executeUpdate();
	
		//03.tbl_charge에 delete 코드 실행
		pstmt = conn.prepareStatement("delete from tbl_charge where 시설명 = ? ");
	
		pstmt.setString(1, args[0]);
		
		//04.tbl_charge의 내용을 Select한 결과 console에서 확인
		
		
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
		}
//			finally {
//			try {conn.close();}catch(SQLException e) {e.printStackTrace();}
//		}
		
	}
}
