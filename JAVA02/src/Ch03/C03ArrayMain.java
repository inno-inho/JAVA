package Ch03;

public class C03ArrayMain {

	public static void main(String[] args) {
		
//		1차원 배열의 배열 요소는 해당 배열을 이루는 자료형 단위
//		2차원 배열의 배열 요소는 1차원 배열
//		3차원 배열의 배열 요소는 2차원 배열
// 		int arr[][] = new int[행][열]?
		
		int arr[][] = {								
				{10,20,30},
				{40,50,60,65,67},
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44},
		};
			
		System.out.println("행의 길이 : "  + arr.length);			// 2차원 배열의 요소는 1차원이기때문에 행의 개수 총 4개가 나온다
		System.out.println("행의 길이 : "  + arr[0].length);		// arr[0]행의 요소는 3개
		System.out.println("행의 길이 : "  + arr[1].length);		
		System.out.println("행의 길이 : "  + arr[2].length);
		System.out.println("행의 길이 : "  + arr[3].length);
	}
}


