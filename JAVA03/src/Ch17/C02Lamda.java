package Ch17;

import java.util.Scanner;

interface Printer
{
	// void print(String name);		// 추상 메서드
	// String print(String message);	// 반환 자료형이 있는 
	String print();
}

public class C02Lamda {

	public static void main(String[] args) {
		
		// 01
//		Printer printer = (message) -> {System.out.println("01." + message);};				// Printer 함수 안에 추상메서드가 하나만 있다고 한다면 람다함수로 해결 가능
//		printer.print("Hello");
		
		// 02	반환 자료형이 있는 인터페이스 함수를 람다함수로
//		Printer printer2 = message->"02." + message;			// message->{return "02." + message;};
//		String str = printer2.print("Hello world");
//		System.out.println(str);
	
		// 03 키보드로 입력받아서 출력(람다활용)
		Printer printer3 = () -> {
			// Scanner 생성
			System.out.println("아무거나 입력해줘");
			Scanner sc = new Scanner(System.in);
		
			// 키보드로 문자열 받기
			String str = sc.nextLine ();
			
			// 입력된값 리턴
			
			return "03. " + str ;
		};
		
		System.out.println(printer3.print());
	}

}
