package Ch03;

import java.util.Arrays;

public class C02ArrayMain {

	public static void main(String[] args) {
		
		// 얕은복사(주소복사)
		int arr1[] = {10, 20, 30};		// -> new int[3], arr1[0] = 10, arr1[1] = 20, arr1[2] = 30 
		int arr2[];
		arr2 = arr1;					// arr1의 주소값을 arr2에 저장
		arr1[0] = 100;					// arr2가 arr1을 참조하고 있기 때문에 arr2[0]의 값도 100이 됨
		
		Arrays.stream(arr1).forEach(System.out::println);
		System.out.println("===========================");
		Arrays.stream(arr2).forEach(System.out::println);
		
		//깊은복사(값복사)
		int arr3[] = new int[3];						// for문을 이용해서 하나하나 배열의 값 저장중
		for(int i=0;i<arr1.length;i++)
					arr3[i] = arr1[i];
				
		//Arrays API
		int arr4[] = Arrays.copyOf(arr1,arr1.length);	
				
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		
		
	}

}
