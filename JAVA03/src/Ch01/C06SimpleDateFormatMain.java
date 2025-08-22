package Ch01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SimpleDateFormatMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("YYYY/MM/DD 입력: ");			// 여기 형식만 맞추면 입력하는데는 문제없음
		String ymd = sc.next();
		
		// 포매터 객체 생성(입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/mm/dd");	// 입력받은 년월일이 저 포맷에 맞게 들어오는지 확인 후 문자열로 변경 
		Date date = fmtin.parse(ymd);									// date에 담겠다
		System.out.println(date);
		
		System.out.println("----------------");
		// 포매터 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println(fmtout.format(date));
	}

}
