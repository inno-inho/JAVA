package Ch03;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMAIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		int [] arr1 = new int[5];		//  이것도 가능
		int arr1 [] = new int[5];
		System.out.println("배열길이: " + arr1.length);
		System.out.println("5개의 값을 입력하세요");
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();

		for(int i = 0; i<arr1.length; i++) {			// for문으로 배열 요소 꺼내기
			System.out.println(i + "." + arr1[i]);
		}
		
		System.out.println("============================");
		
		for(int el :arr1) {								// 향상된 for문으로 배열 보기
			System.out.println(el);
		}
		
		System.out.println("============================");
		
//		Arrays.stream(arr1).forEach((el) -> {System.out.println(el);});			// 람다식으로 배열 보기
//		Arrays.stream(arr1).forEach(el -> System.out.println(el));			// 람다식으로 짧게 쓰기. 
//		Arrays.stream(arr1).forEach(System.out::println);			// 더 짧게 쓰기. 
		
//		배열에 입력된 정수중에 최대값과 최소값을 출력
		
//		int max = arr1[0];
// 		// int min = arr1[0];
//		
//		for(int el : arr1) {
//			if(max <= el) {
//				max = el;
//			}
//			
//			if(min > el) {
//				min = el;
//			}
//		}
//		
//		System.out.printf("최대값: %d, 최소값: %d", max);
	
		System.out.println("Max: " + Arrays.stream(arr1).max().getAsInt());
		System.out.println("min: " + Arrays.stream(arr1).min().getAsInt());
		
		
		
		
	}

}
