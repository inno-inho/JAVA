package Ch03;

import java.util.Scanner;

public class C06Ex {

	//5개의 정수값을 입력받아 int형 배열에 저장하고
	//최대값,최소값,전체합을 출력합니다.
	
	
	
	//5 명의 학생에 국영수점수를 입력받아 2차원배열 저장
	//각 학생의 국영수 점수의 합/평균 구하고
	//각 과목당 합 /평균 구해보세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("정수 5개 입력: ");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
			
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		
		for(int el : arr) {
			if(max <= el) {
				max = el;
			}
			if(min >= el) {
				max = el;
			}
			sum += el;
		}
		
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		
		
		
//		int score[][] = new int[5][3];
		
		
	}
}