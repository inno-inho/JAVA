package Ch01;

class C05Simple{
	
	// 속성
	int num = 10;		// 클래스 안의 변수 == 멤버변수
	
	// 기능
	void Func1() {
		System.out.println("num: " + num);		// Func1의 바깥의 멤버변수 출력
		int num = 20;		// Fun1의 지역변수
		num++;									// Func1의 지역변수
		this.num++;								// 이 객체 C05Simple의 멤버변수 num
		System.out.println("num: " + num);		// Func1의 지역변수 출력
	}		// 함수 안의 변수 == 지역변수
	
	void Func2() {
		System.out.println("num: " + num);
		if(num > 0) 
		{
			int num = 100;				// if문 내의 지역변수 num
			System.out.println("num: " + num);
		}
		System.out.println("num: " + num);			// 멤버변수 num
		while(num < 15) {
			int num = 100;				// while문 안의 지역변수 num
			System.out.println("num: " + num );
			num ++;
		}
	}

	void Func3(int num) {
		this.num = num;		// 이 객체 C05Simple 멤버 변수 num에 Func3의 지역변수 num에 값을 대입시켜서 그걸 쓰겠다
	}
	
	
}


public class C05LocalVarMain {

	public static void main(String[] args) {
		C05Simple obj =new C05Simple();
		obj.Func1();			// num: 10 -> 멤버변수로 저장한 거 사용가능
		System.out.println();

		obj.Func2();
	}

}
