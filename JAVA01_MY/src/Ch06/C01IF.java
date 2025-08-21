package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		// ---------------------------------
		// 단순 IF
		// ---------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다");
//
//		}
//		System.out.println("첫 번째 코드블럭 종료");
//		if(age < 8) {
//			System.out.println("학교에 다니지 않습니다");
//		}
//		System.out.println("두번 째 IF 코드 블럭 종료");
//		System.out.println("프로그램을 종료");
//		
//		sc.close();
		 
		// -----------------------------------
		// IF - ELSE
		// -----------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		
//		if(age >= 8)
//			System.out.println("학교에 다닙니다");
//		else
//			System.out.println("학교에 안가요");
//		
//		System.out.println("프로그램 종료");
//		
//		sc.close();
		
		// ----------------------------
		// 문제 1
		// ----------------------------
		
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력
		// 순서도도 그려보세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 하나 입력");
//		int num = sc.nextInt();
//		
//		if(num % 3 == 0 && num % 5 == 0) {
//			System.out.printf("입력한 %d는 3의 배수입니다\n", num);
//		}
//		
//		System.out.println("프로그램 종료");
//		
//		sc.close();
		
		
		// -----------------------------
		// 문제 2
		// -----------------------------
		
		// 두개의 정수를 입력받아 큰 수 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 2개 입력");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			System.out.printf("%d가 %d보다 더 큽니다", num1, num2);
//		}else if(num2 > num1)
//			System.out.printf("%d가 %d보다 더 큽니다", num2, num1);
//		 else 
//			System.out.println("두 수는 같습니다");
		
	
		
		
		
		
		// ------------------------------
		// 문제 3
		// ------------------------------
		
		// 세 개의 정수를 입력받아 큰 수 출력
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 3개 입력");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		// System.out.printf("%d %d %d\n", num1, num2, num3);
//		
//		int max = num1;
//		if(max < num2){
//			max = num2;
//		}
//		if(max < num3){
//			max = num3;
//		}
//		
//		System.out.printf("가장 큰 수는 %d입니다", max);
		
		
		
//		if(num1 >= num2 && num1 >= num3) {
//			System.out.println("가장 큰 수" + num1);
//			}else if(num2 >= num1 && num2 >= num3){
//					System.out.println("가장 큰 수" + num2);
//			}else {
//				System.out.println("가장 큰 수:" + num3);
//			}
			
		
		// -------------------------------------
		// IF - ELSE IF - ELSE
		// -------------------------------------
		// 과목 1, 2, 3, 4, 중 하나라도 40점 미만이면 불합격
		// 과목평균이 100점만점 기준으로 60점 미만이면 불합격
		// 아니면 합격
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("과목 1의 시험 점수를 넣어주세요:");
//		System.out.println("과목 2의 시험 점수를 넣어주세요:");
//		System.out.println("과목 3의 시험 점수를 넣어주세요:");
//		System.out.println("과목 4의 시험 점수를 넣어주세요:");
//		
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		
//		if(과목1 < 40) {
//			System.out.println("불합격");
//		}else if(과목2 < 40) {				// 과목1 >= 40 && 과목2 < 40
//			System.out.println("불합격");
//		}else if(과목3 < 40) {
//			System.out.println("불합격");
//		}else if(과목4 < 40) {
//			System.out.println("불합격");
//		}
//		else if(평균 < 60) {
//			System.out.println("불밥격");
//		}
		
		
		// 문제
		
		// 시험점수를 입력받아
		// 90~100점은 A, 
		// 80~89점은 B, 
		// 70~79점은 c, 
		// 60~69점은 d, 
		// 나머지 점수는 F를 출력하는 프로그램
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("시험 점수 입력:");
//		int point = sc.nextInt();
//		char grade = '0';
//		
//		if(point >= 90) {
//			grade = 'A';
//		}else if(point >= 80) {
//			grade = 'B';
//		}else if(point >= 70) {
//			grade = 'C';
//		}else if(point >= 60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
//		
//		System.out.printf("당신의 grade는 %s입니다", grade);
//		

		// 문제
		
		// 나이별로 요금을 부과하는 else if문을 만드세요
		// 8세미만 : 요금은 1000원
		// 14세미만 : 요금은 2000원
		// 20세미만 : 요금은 2500원
		// 20세이상 : 요금은 3000원
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("당신의 나이는?");
//		int age = sc.nextInt();
//		
//		if(age >= 20) {
//			System.out.printf("%d살은 20세 이상이므로 요금은 3000원", age);
//		}else if(age >= 14 && age < 20 ){
//			System.out.printf("%d살은 14세 이상 20세 미만이므로 요금은 2500원", age);
//		}else if(age >= 8 && age < 14) {
//			System.out.printf("%d살 8세 이상 14세미만이므로 요금은 2000원", age);
//		}else {
//			System.out.println("8세미만은 공짜");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
