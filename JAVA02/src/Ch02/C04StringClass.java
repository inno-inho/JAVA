package Ch02;

public class C04StringClass {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
	
		System.out.printf("%X\n",System.identityHashCode(str1));
		System.out.printf("%X\n",System.identityHashCode(str2));
		System.out.printf("%X\n",System.identityHashCode(str3));
		System.out.printf("%X\n",System.identityHashCode(str4));
		
		
		System.out.println("---------------------");
		System.out.println("str1==str2 ? " + (str1==str2));			//  str1이나 str2나 들어있는 값은 java이다. 상수풀에서는 하나의 값이 저장되고 다른 변수도 그 상수를 쓰려고 하면 다시 저장하는게 아닌 원래 저장되어있던 상수정보(위치값)을 넘긴다. 그러니까 둘은 같은 값이다
		System.out.println("str3==str4 ? " + (str3==str4));			//  str3과 str4은 class String의 객체이다. 
																	//	고로 str3과 str4를 출력하면 그들이 저장되어있는 힙 저장소의 해쉬코드가 반환된다. 
																	//  둘의 주소 해쉬코드는 다르므로 false
		System.out.println("str1==str3 ? " + (str1==str3));			//  str1 = java str3 = 해쉬코드 -> False
		System.out.println("str2==str4 ? " + (str2==str4));			//  str2 = java str4 = 해쉬코드 -> False
		System.out.println("---------------------");
		
//		equals		// 문자열의 일치여부를 비교하는 메서드
		
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
	
	}

}
