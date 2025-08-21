package Ch05;

// 부모
class Super{
	int n1;
}


// 자식
class Sub extends Super{
	int n2;
}






public class C06UpDownCastingMain {
	public static void main(String[] args) {
		
		// NoCasting(형변환 없음/자료형일치)
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
		
		// UpCasting(상위클래스 참조변수 = 하위클래스형 객체)(자동형변환)
		// 자동형변환이 일어나는 이유 -> 상위클래스가 하위클래스보다 작다 -> 그러므로 메모리 영역을 침범할 우려가 없다
		// UpCasting을 쓰는이유 -> 상속관계에 구성된 모든 하위객체를 연결할 수 있다
		// 					-> UpCasting된 상태에서는 재정의된 함수에 접근이 가능하다
		
		Super ob3 = new Sub();	// Sub객체를 Super 클래스에 업캐스팅
		ob3.n1 = 100;
//		ob3.n2 = 200;			// 상위객체 Super클래스는 n2라는 속성를 몰라서 오류 뜸
		
		Super ob4 = ob2;		// Sub객체 ob2를 Super 클래스 ob4에 업캐스팅
		ob4.n1 = 200;
		
		
		
		// DownCasting(하위클래스 참조변수 = 상위클래스형 객체)(강제형변환)
		// UpCasting 된 상태를 전제로 한다
//		Sub ob5 = (Sub)ob1;				// 상위클래스 Super의 객체 ob1을 하위클래스 Sub의 객체 0b5에 다운캐스팅
//									// 하위클래스가 상위클래스보다 더 크기 때문에 컴파일에서 오류 띄움 -> 그래서 강제로 형변환시켜야함
//		ob5.n1 = 100;
//		ob5.n2 = 200;
		
		Sub down = (Sub)ob4;		// Super클래스로 업캐스팅한 ob4를 Sub객체로 다운캐스팅 
		down.n1 = 1000;				// ob4는 원래 sub객체 0b2가 super클래스로 upCasting한 거였다
		down.n2 = 2000;							// 그러므로 downCasting해서 Sub로 가도 Sub만의 고유한 필드 n2에도 접근이 가능하다
		
		
		
	}
}
