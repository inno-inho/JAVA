package Ch02;

public class C05StringClass {

	public static void main(String[] args) {
		
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);		// concat은 문자열에 매개변수를 덧붙이는 메서드
		
//		System.out.printf("%x\n", System.identityHashCode(str1));
//		System.out.printf("%x\n", System.identityHashCode(str2));
//		System.out.printf("%x\n", System.identityHashCode(str3));
//		System.out.printf("%x\n", System.identityHashCode(str4));

//		System.out.println("문자열 길이 : " + str1.length());
//		System.out.println("한문자 찾기 : " + str1.charAt(2));
//		
//		System.out.println("인덱스 찾기 : " + str1.indexOf('a'));
//		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a'));
//		
//		System.out.println("문자열포함 여부 : " + str1.contains("va"));
//		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
		
//		System.out.println("문자열 자르기 : " + (str1.substring(2,6)));		// 2번인덱스부터 6번인덱스까지
		
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		String [] result = str6.split(",");			// ,를 기준으로 나눠서 그 값들을 result에 배열형식으로 넣어줘
		
		for(String hobby : result)					// 배열 result에 있는 값을 뽑아보기위한 향상된 for문
			System.out.println(hobby);
		
		
		
		
		
//		int i=0;
//		String str  = "";
//		while(i<10) {
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));	// 저장위치가 계속 바뀜-> 메모리 누수
//			i++;
//		}
		
		// 문자열 덧붙이기(메모리 누수 방지 클래스: StringBuffer , StringBuilder)
		
//		int i = 0;
//  //			String str  = "";
//			StringBuilder str = new StringBuilder("");
//			while(i<10) {
//  //				str +=i;
//				str.append(i);
//				System.out.print("str : " + str + " ");
//				System.out.printf("위치 : %x\n",System.identityHashCode(str));
//				i++;
//			}
		
	}

}
