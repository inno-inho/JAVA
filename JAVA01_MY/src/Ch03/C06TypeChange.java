package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {
		
		char n1 = 60000;
//		short n2 = n1;				// 자료형의 크기는 같으나 char은 정수만 short는 음수만 지원하기때문에 범위에서 차이가 있다.
		short n2 = (short)n1;				
		System.out.println(n2);		// -5536
		
		int n3 = n2;
		System.out.println(n3);	
		
		

	}

}
