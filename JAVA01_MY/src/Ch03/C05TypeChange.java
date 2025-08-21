package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 4;
		double num3 = 10, num4 = 4;
		double dnum1 = num1 / num2;			// rv에서는 int형을 나누고 있으므로 정수의 값(몫)만 저장된다. 
											// -> 그 후 lv에 대입하기 위해 double형으로 변환
		double dnum2 = num3 / num4;		// 2.5
		
		double dnum3 = (num1 * 1.0) / num2;		// 2.5
		double dnum4 = (double)num1 / num2;		// 2.5
		
		System.out.println("dnum1: " + dnum1);	
		System.out.println("dnum2: " + dnum2);	
		System.out.println("dnum3: " + dnum3);	
		System.out.println("dnum4: " + dnum4);			
		
	
	}

}
