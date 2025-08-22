package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제1 {

	// 연결할 DB 정보
	
	public static String id = "root";
	public static String pw = "1234";
	public static String url = "jdbc:mysql://localhost:3306/opendatadb";
	
	private static Connection conn = null; 
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null ;
	
	public static void conn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 로딩");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB 연결 성공");
	}
	
	public static int insertStudent(StudentDto student) throws SQLException {
		
		pstmt = conn.prepareStatement("insert into student values(?, ?, ?, ?)");
		
		pstmt.setInt(1, student.getId());
		pstmt.setString(2, student.getName());
		pstmt.setString(3, student.getMajor());
		pstmt.setString(4, student.getGrade());
		
		int result = pstmt.executeUpdate();
		
		return result;	
	}
	
	public static int updateStudent(StudentDto student) throws SQLException {
		
		pstmt = conn.prepareStatement("update student set name = ?, major = ?  where id = ?");
		
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getMajor());
		pstmt.setInt(3, student.getId());
		
		int result = pstmt.executeUpdate();
		return result;
	}
	
	public static int deleteStudent(StudentDto student) throws SQLException {
		
		pstmt = conn.prepareStatement("delete from student where id = ?");
		
		pstmt.setInt(1, student.getId());
		
		int result = pstmt.executeUpdate();
		
		return result;	
	}
	
	public static List<StudentDto> selectAll() throws SQLException{
		
		pstmt = conn.prepareStatement("select * from student");
		
		rs = pstmt.executeQuery();
		
		List<StudentDto> list = new ArrayList();
		StudentDto dto = null;
		
		if(rs != null) {
			while (rs.next()) {
				dto = new StudentDto();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setMajor(rs.getString("major"));
				dto.setGrade(rs.getString("grade"));
				list.add(dto);
			}
		}
		return list;
	}
	
	public static StudentDto select(int id) throws SQLException {
		
		pstmt = conn.prepareStatement("select * from student where id = ?");
		
		pstmt.setInt(1, id);
		rs= pstmt.executeQuery();
		StudentDto dto = null;
		
		if(rs != null) {
			if(rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setMajor(rs.getString("major"));
				dto.setGrade(rs.getString("grade"));
				
			}
		}
		
		return dto;
		
	}
	
	
	
	public static void main(String[] args) {
		try {
		conn();			// DB 연결
		
//		conn.setAutoCommit(false);		// 트랜잭션 시작지점
		
		// insert
		
//		insertStudent(new StudentDto(1, "이노", "관광학과", "4학년"));
//		insertStudent(new StudentDto(2, "헤렌", "마케팅학과", "2학년"));
//		insertStudent(new StudentDto(3, "헤렌악마", "너무예뻐과", "3학년"));
//		insertStudent(new StudentDto(4, "ヘレン", "可愛い❤", "(⋈◍＞◡＜◍)。✧♡"));
		
		// Update
		
//		StudentDto studentId3 = new StudentDto();
//		
//		studentId3.setId(3);
//		studentId3.setName("헤렌조아");
//		studentId3.setMajor("사랑스러워과");
//		
//		int updateResult = updateStudent(studentId3);
//		
//		if(updateResult > 0) {
//			System.out.println("수정 성공");
//		}else {
//			System.out.println("수정 실패");
//		}
		
		// delete
		
//		StudentDto studentId4 = new StudentDto();
//		
//		studentId4.setId(4);
//		
//		int deleteResult = deleteStudent(studentId4);
//		
//		if(deleteResult > 0) {
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제 실패");
//		}
		
		// selectAll
		
//		List<StudentDto> allStudent = selectAll();
//		System.out.println("selectAll: ");
//		allStudent.forEach(System.out::println);
		
		// select
		
		StudentDto studentId1 = select(1);
		System.out.println("select" + studentId1);
		
		
		}catch(Exception e1){
			System.out.println("DB 작업 실패: " + e1.getMessage());
			e1.printStackTrace();
			
		}
		
		
		finally {}
		
		
	}
	
}
