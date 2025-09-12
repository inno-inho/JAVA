package Ch05;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {
	
		//1.문제(삼항연산자 + 논리연산자)
				// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
				// 총점수합의 평균이 70점이상이면 '합격'
				// 미만이면 '불합격'을 출력합니다
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 점수 입력: \n");
//		System.out.print("수학 점수 입력: \n");
//		System.out.print("영어 점수 입력: \n");
//		
//		int korean = sc.nextInt();
//		int math = sc.nextInt();
//		int english = sc.nextInt();
//		
//		// System.out.printf("점수들 %d %d %d\n", korean, math, english);
//		
//		int average = (korean + math + english)/3;
//		
//		if(korean >= 40 && math >= 40 && english >= 40 && average >= 70) {
//			System.out.println("합격입니다");
//		}else {
//			System.out.println("불합격입니다");
//		}
//		
//		sc.close();
//		

				//2.미니문제(%연산자)
				//키보드로 부터 정수값 2개를 입력받아
				//두수의 합이 짝수이면 "짝수입니다"
				//홀수이면 "홀수입니다" 를 출력하세요~
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// System.out.printf("%d %d", num1, num2);
		
		int sum = num1 + num2;
		
		if(sum % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		

	}

}
