package Ch02;

import java.util.Scanner;

public class C03EX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("나눗셈 위한 두 수를 입력하세요:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("나눗셈 결과: " + n1/n2); 	// n/0일 시 예외발생
		}catch(ArithmeticException e) {
			System.out.println("예외 발생: " + e.getCause() );
		}
		System.out.println("실행되어야 할 코드 1");
		System.out.println("실행되어야 할 코드 2");
		System.out.println("프로그램 종료");
	
	}

}
