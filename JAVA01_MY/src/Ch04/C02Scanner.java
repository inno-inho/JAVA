package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값: " + num1);
		
		System.out.println("실수 입력: ");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값: " + num2);

		System.out.println("문자열 입력: ");
//		String str1 = sc.next();				// 문자열 입력받기 가능함수, 띄워쓰기는 포함하지 않는다
		sc.nextLine();							// 엔터키를 잡기위해서 위에 하나 더 쓰는거임
		String str1 = sc.nextLine();			// 문자열 입력받기 가능함수, 띄워쓰기도 포함.
												// 띄워쓰기도 포함하기때문에 enter키를 쳐서 생긴 버퍼도 값이 들어왔다고 인식
		System.out.println("입력된 문자열: " + str1);
		
		sc.close();


	}

}
