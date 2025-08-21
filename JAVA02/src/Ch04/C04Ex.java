package Ch04;

import java.util.Arrays;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
class ArrayUtils {
	
		
	   public static int[] concat(int[] a, int[] b) {
	        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
		   int[] c = new int[a.length + b.length];
		   
		   for(int i = 0; i < a.length; i++) {
			   c[i] = a[i];
		   }
		   
		   for(int i = 0; i < b.length; i++) {
			   c[a.length + i] = b[i];
		   }
		
		   
		   return c;
	   }  
	   public static void print(int [] a) {
		   System.out.println(Arrays.toString(a));
	   }
//	   @Override
//	   public String toString() {
//		return "ArrayUtils []";
//	   }
	}
public class C04Ex {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtils.concat(array1, array2);
		ArrayUtils.print(array3);
		
		for(int i = 0; i < array3.length - 1; i++) {
			for(int j = 0; j < array3.length - 1)
		}
	}
}