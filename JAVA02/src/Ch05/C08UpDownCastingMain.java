package Ch05;

class Parent{
	void func1() {
		System.out.println("우리아들 월드클래스 아닙니다 by Parent");
		}
	void func2() {
		System.out.println("빠따질 by Parent");
	}
}

class Son extends Parent{
	void func2() {
		System.out.println("쏘니! by Son");
	}
	
}


public class C08UpDownCastingMain {

	public static void main(String[] args) {
		// NoCasting
		Parent ob1 = new Parent();
		ob1.func1();
		
		System.out.println("-----------------------------");
		
		// NoCasting
		Son ob2 = new Son();
		ob2.func1();
		ob2.func2();
		System.out.println("======================");
		
		// UpCasting
		Parent ob3 = new Son();		// Son 객체를 Parnet에 업캐스팅
		ob3.func1();
		ob3.func2();				// Son에서 Overriding된 func2()에 접근
		
		// UpCasting된 상태에서
		// 확장된(멤버추가) 멤버변수 접근 가능한가? X -> DownCasting 해야 가능
		// 확장된(멤버추가) 멤버함수 접근 가능한가? X -> DownCasting 해야 가능
		// 재정의된 멤버함수 접근 가능한가? O
	}

}
