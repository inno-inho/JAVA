package Ch03;

public class C07TypeChange {

	public static void main(String[] args) {

		// ------------------------------
		// 문자열
		// ------------------------------
		
//		System.out.println("문자열1" + "문자열2");			// 문자열 + 문자열
//		System.out.println("문자열1" + ',' + "문자열2");	// 문자열 + 문자 + 문자열	 -> 문자를 문자열화 시킴
//		System.out.println("문자열1" + 2);				// 문자열 + 숫자 -> 숫자를 문자열화 시킴
//		System.out.println("문자열1" + ',' + '!');
//		System.out.println(',' +'!' + "문자열");	// 77문자열 -> (',' == 44) + ('!' == 33)이 단일문자이기때문에 숫자 취급당함
//		System.out.println("문자열1" + "문자열2");	
		
		System.out.println("10" + "20");	// 문자열 연결
		int n1 = Integer.parseInt("10");	// 웹개발코드시 폼으로부터 전달받은 값은 다 문자열임
		int n2 = Integer.parseInt("20");	// Integer.parseInt는 문자열에 갇혀있는 숫자를 숫자로 해석해주는 메서드
		System.out.println(n1 + n2);
	
		// 문자열 -> 숫자형으로 변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3 + n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		
		System.out.println(n5 + n6);
		
		
	}

}
