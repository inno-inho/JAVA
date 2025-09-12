package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속 문장
//		}
		
		// 01 HELEN 10회 출력
		// 반복문을 벗어나기 위한 탈출용 변수 지정: i
		// 탈출용 조건식			       : i < 10
		// 탈출 연산식					   : i++
		
//		int i = 0;
//		while(i < 10) {
//			System.out.printf("HELEN %d\n", i);
//			i++;
//		}
		
		// 02 HELEN N회 출력(N은 키보드로 받는 정수값, N>0)
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		if(N <= 0) {
//			System.out.println("입력하는 수는 0보다 커야합니다");
//			System.exit(-1);
//		}
//		
//		int i = 1;
//		while(i <= N) {
//			System.out.printf("HELEN %d\n", i);
//			i++;
//		}
		
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i <= 10) {
//			System.out.printf("i: %d\n", i);
//			sum += i;
//			i++;
//		}
//		
//		System.out.printf("%d부터 %d까지의 합: %d\n", 1, 10, sum);
		
		
		// 문제
		// 1부터 N까지 누적합 구하기
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 하나 입력");
//		int N = sc.nextInt();
//		
//		if(N <= 1) {
//			System.out.println("n은 1보다 커야합니다");
//			System.exit(-1);
//		}
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i <= N) {
//			System.out.printf("%d Helen!\n", i );
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("누적합: " + sum);
		
		// N부터 M까지 누적합 구하기(N<M)
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 하나 입력");
//		System.out.println("숫자 하나 더 입력");
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
		
		
//		int i = 0;
//		int sum = 0;
//		
//		if(N >= M) {
//			System.out.println("두 번째 숫자를 더 크게 입력하세요");
//		}else {
//			while(N <= M) {
//				i = N;
//				sum += i;
//				N++;
//			}			
//		}
//		System.out.printf("누적합은 %d", sum);
		
		
		
		
		
		
		
		
		// n부터 m까지 수중(n<m)에 짝수의 합, 홀수의 합을 각각 구해서 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 하나 입력");
//		System.out.println("숫자 하나 더 입력");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int i = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		if(n >= m){
//			System.out.println("두 번째 숫자를 첫 번째 숫자보다 더 크게 입력하세요");
//		}else {
//			while(n <= m) {
//				i = n;
//				
//				if(i % 2 == 0) {
//					sum2 += i;
//					n++;
//				}else {
//					sum1 += i;
//					n++;
//				}
//			
//			}
//			System.out.printf("짝수의 합: %d\n", sum2);
//			System.out.printf("홀수의 합: %d\n", sum1);
//		}
	
		
		
		
		// n단 구구단 출력(2<= n <= 9)
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("구구단 숫자 하나 입력");
//		int n = sc.nextInt();
//		
//		if(!(2 <=n && n <= 9)) {
//			System.out.println("구구단의 숫자는 2에서 9사이로 입력하세요");
//			System.exit(-1);
//		}
//		
//		int i = 1;
//		int multiply = 0;
//		
//		while(i <= 9) {
//			multiply = n * i; 
//			System.out.printf("%d X %d = %d\n", n, i, multiply);
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 유효성 확인( n<2 || n >9)
		while(n < 2 || n > 9) {
			System.out.println("2<= n <= 9의 값을 입력하세요");
			n = sc.nextInt();
		}
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
			i++;
		}
		
		
		
		
		
		
		
		
		
	}

}
