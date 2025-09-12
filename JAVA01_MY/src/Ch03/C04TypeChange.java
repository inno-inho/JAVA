package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {

//		정수 연산식 자동형변환(int보다 작은 변수 자료형간의 산술연산시 -> int로 자동형변환)
//		byte x = 10;
//		byte y = 20;
//		byte result1 = x + y;	// 연산자는 중앙처리장치를 거치는데 그 당시 x와 y를 int로 들고와 연산하기 때문에 값은 int형이 된다
								// 고로 int형의 값을 byte의 result1에 담을 수 없게 된다
		
//		byte result2 = (byte)(x + y);
//		int result3 = x + y;
		
		
		// 정수 연산식 자동형변환(int보다 큰 변수 자료형간의 산술연산시 -> 큰 자료형(long)으로 자동형변환)
//		byte var1 = 10;
//		int var2 = 100; 
//		long var3 = 1000L;
//		int result = var1 + var2 + var3;		// var3이 long이기때문에 rv는 long으로 되어있음
		
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar);
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);

	}

}
