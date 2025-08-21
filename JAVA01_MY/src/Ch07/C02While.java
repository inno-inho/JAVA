package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		// 2단에서 9단까지 출력
		
//		int dan = 2;
//		while(dan <= 9) {
//			// System.out.printf("%d\n", dan);
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println("-------------------------------------");
//			dan++;
//		}
		

		// 2단부터 9단 (2X9, 2X8, 2X7... 9X9..9X1)
		
//		int dan = 2;
//		
//		while(dan <= 9) {
//			int i = 9;
//			while(i >= 1) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//				i--;
//				}
//			System.out.println("-----------------------");
//			dan++;
//		}
		
		
		// 9단부터 2단 (9X9, 9X8, 9X7... 2X9..2X1)
		
//		int dan = 9;
//		while(dan > 1) {
//			int i = 9;
//			while(i >= 1) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i--;
//			}
//			System.out.println("---------------");
//			dan--;
//		}
		
		
		// 2단부터 n단 (n > 2)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 숫자 하나 입력");
//		int n = sc.nextInt();
//		
//		while(n < 2 || n > 9) {
//			System.out.println("2부터 9사이의 숫자를 입력하세요");
//			n = sc.nextInt();
//		}
//		
//		int dan = 2;
//		while(dan <= n) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println("---------------------");
//			dan++;
//		}
		
		
		// n단 - m단 (n < m)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 앞에 하나 입력");
//		System.out.println("구구단 뒤에 숫자 입력");
//		int min = sc.nextInt();
//		int max = sc.nextInt();
//		
//		while(min >= max) {
//			System.out.println("뒤에 숫자를 더 큰 거 넣으세요");
//			min = sc.nextInt();
//			max = sc.nextInt();
//		}
//		
//		//	int dan = 0;
//		
//		while(min <= max) {
//		//	dan = min;
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d X %d = %d\n", min, i, min * i);
//				i++;
//			}
//			System.out.println("-----------------------");
//			min++;
//		}
//		
		
		
		// -------------------------
		// 별 찍기
		// -------------------------
		
		// *****
		// *****
		// *****
		// *****
		
//		int i = 1;
//		while(i <= 4) {
//			int j = 1;
//			while(j <= 5) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.printf("\n");
//		}
		
		// -----------------------------------
		// 높이를 입력받아서(n)만큼 별찍기
		// -----------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("높이를 입력하세요");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while(i <= height) {
//			int j = 1;
//			while(j <= 5) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		// --------------------------------
		// *
		// **
		// ***
		// ****
		// --------------------------------
		
//		int i = 0;
//		while(i < 4) {
//			int j = 0;
//			while(j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
	
		// ----------------------------------
		// 높이값을 받아서(n)
		// *	
		// **
		// ***
		// ****
		// 이러한 형태로
		// ----------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("높이를 입력하세요");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while(i <= height) {
//			int j = 1;
//			while(j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		// -------------------------------
		// ****
		// ***
		// **
		// *
		// -------------------------------
		
//		int i = 1;
//		while(i <= 4) {
//			int j = 4;
//			while(j >= i) {
//				System.out.printf("*");
//				j--;
//			}
//			i++;
//			System.out.println();
//		}
		
//		int i = 0;
//		
//		while(i<4) {
//			int j = 0;
//			while(j < 4-i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// ----------------------------------
		// 높이값을 받아서(n)
		// ****
		// ***
		// **
		// *
		// 이러한 형태로
		// ----------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("높이를 입력해주세요");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		while(i <= height) {
//			int j = height;
//			while(j >= i) {
//				System.out.printf("*");
//				j--;
//			}
//			i++;
//			System.out.println();
//		}
		
		// ---------------------------------
	    // 	   *
	    //    **
	    //   ***
	   	//  ****
	  	// *****
		// ---------------------------------
		
//		int i = 1;
//		while(i <= 5) {
//			int j = 1;
//			int k = 1;
//			
//			while(k <= 5-i) {
//				System.out.printf(" ");
//				k++;
//			}
//			
//			while(j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		// ----------------------------
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		// ----------------------------
		
//		int i = 1;
//		while(i <= 5) {
//			int k = 1;
//			while(k <= 5-i) {
//				System.out.printf(" ");
//				k++;
//			}
//		
//			int j = 1;
//			while(j <= (2*i - 1)) {
//				System.out.printf("*");
//				j++;
//			}
//			
//			int p = 1;
//			while(p <= 5-i) {
//				System.out.printf(" ");
//				p++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// --------------------------------------
		//	    *
		//	   ***
		//	  *****
		//	 *******
		//	*********
		//	 *******
		//	  *****
		//	   ***
		//	    *
		// --------------------------------------
		
		// -------------------------------------------------------
		// i(행)				j(공백)					k(별)
		// -------------------------------------------------------
		
		// 0				0-2					0-0
		// 1				0-1					0-2
		// 2				0-0					0-4
		// 3				x					0-6
		// --------------------------------------------------------
		// if(i<4)			j=0					k=0
//							j++					k++
//							j<3-i				k<=2*i
		// --------------------------------------------------------
		// 4				0-0					0-4
		// 5				0-1					0-2
		// 6				0-2					0-0
		// i=0				k=0					k=0
		// i++				k++					k++
		// i<7				j<=i-4				k<6*2-2*i
		
//		int i = 0;
//		while(i<7) {
//			
//			if(i<4) {
//				// 공백
//				int j = 0;
//				while(j < 3-i) {
//					System.out.println("");
//					j++;
//				}
//				// 별
//				int k = 0;
//				while(k <=2*i) {
//					System.out.printf("*");
//					k++;
//				}
//			}else {
//				int j = 0;
//				while(j <= i-4) {
//					System.out.printf(" ");
//					j++;
//				}
//				int k = 0;
//				while(k < 6*2-2*i ) {
//					System.out.println("*");
//					k++;
//				}
//			}
//			
//			
//			
//			System.out.println();
//			i++;
//		}
		
		
		// 높이 받아서 만들기
		// --------------------------------------
		//	    *
		//	   ***
		//	  *****
		//	 *******
		//	*********
		//	 *******
		//	  *****
		//	   ***
		//	    *
		// --------------------------------------
		
		// -------------------------------------------------------
		// i(행)				j(공백)					k(별)
		// -------------------------------------------------------
		
		// 0				0-2					0-0
		// 1				0-1					0-2
		// 2				0-0					0-4
		// 3				x					0-6
		// --------------------------------------------------------
		// if(i<h/2 + 1)			j=0					k=0
//							j++					k++
//							j<(h/2)-i				k<=2*i
		// --------------------------------------------------------
		// 4				0-0					0-4
		// 5				0-1					0-2
		// 6				0-2					0-0
		// i=0				k=0					k=0
		// i++				k++					k++
		// i<h				j<=i-((h/2+1)				k<(h-1)*2-2*i
		
		
		
		
		
		// 다이아몬드 내가 푼 거 
//		int i = 1;
//		while(i <=9) {
//			
//			if(i < 5) {				// 5번째 줄까지의 공백
//				int j = 1;
//				while(j <= 5-i) {
//					System.out.printf(" ");
//					j++;
//				}
//			}
//			
//			
//			if(i <= 5) {			// 5번째 줄까지의 별
//				int j = 1;
//				while(j <= (2*i-1)) {
//					System.out.printf("*");
//					j++;
//				}
//			}
//			
//			if(i > 5 && i <=9) {	// 6번째줄부터의 공백
//				int j = 1;
//				
//				while(j <= i-5 ) {
//					System.out.printf(" ");
//					j++;
//				}
//			}
//			
//			if(i > 5 && i <= 9) {	// 6번째줄부터의 별
//				int j = 1;
//				int k = 9-i;
//				while (j <= (2*k+1)) {
//					System.out.printf("*");
//					j++;
//				}
//			}
//			
//			
//			i++;
//			System.out.println();
//		}
//		
		
		// -----------------------------------
		// *******
		//  *****
		//   ***
		//    *
		// -----------------------------------
		
//		-----------------------------
//		i(행)	j(공백)	k(별)
//		-----------------------------
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		-----------------------------
//		
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4(전체 높이)		j<i		j<=3(전체 높이-1)*2 - 2*i(진행되어있는 높이)
		
		
		
//		int i = 0;
//		while(i < 4) {
//			int j = 0;
//			while(j < i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k <= (3*2) - (2*i)) {
//				System.out.printf("*");
//				k++;
//			}
//			i++;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
	}

}
