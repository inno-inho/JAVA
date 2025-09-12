package Ch17;

// 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스를 정의
interface Calculator{
	int calculate(int num1, int num2);
	
}


public class C03Lamda {

	public static void main(String[] args) {
		Calculator add = (int num1, int num2) -> {return num1 + num2;};			// 덧셈

		
		
		Calculator sub = (int num1, int num2) -> {			// 뺄셈
			if(num1 - num2 > 0) 
				return num1 - num2;
			else 
				return num2 - num1;
			};
		
		Calculator mul = (int num1, int num2) -> {return num1 * num2;};		// 곱셈
		
		Calculator div = (int num1, int num2) -> {
			if(num1 - num2 > 0) 
				return num1 / num2;
			else 
				return num2 / num1;
		};
		
		int addNum = add.calculate(1, 3);
		System.out.println(addNum);
		
		int subNum = sub.calculate(4, 9);
		System.out.println(subNum);
		
		int mulNum = mul.calculate(2, 10);
		System.out.println(mulNum);

		int divNum = div.calculate(50, 10);
		System.out.println(divNum);
		
		// 가변인자 받는 덧셈
//		System.out.println(add.calculate(10, 20, 30, 10, 20, 33, 40, 1100 ,213));
		
	}

}
