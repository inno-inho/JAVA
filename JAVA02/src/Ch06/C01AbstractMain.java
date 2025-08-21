package Ch06;

// 일반 클래스 상속관계
class Parent{
	void func() {}
}

class Son extends Parent{
	void func() {
		System.out.println("쏘니! by Son");
	}
	
}

// 추상 클래스 상속관계
// 사용이유: 메서드 구현의 강제성 부여
abstract class Parent2{			// 추상메서드를 가지고 있는 추상클래스
	abstract void func(); 		// 추상메서드(미완성된 함수, {}가 없는)
}

class Son2 extends Parent2{
	void func() {
		System.out.println("쏘니! by Son2");	// parent2에서 미완성시킨 func()함수 완성
	}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		// 일반 클래스 상속관계
		Parent ob1 = new Parent();	// 상위클래스형으로 객체 생성 O
		Son ob2 = new Son();		// 하위클래스형으로 객체 생성 O
		Parent ob3 = new Son();		// Son의 객체 Parent 클래스로 Upcasting
		ob3.func();		// 쏘니! by Son
		
		
		System.out.println("-----------------------------");
		// 추상 클래스 상속관계
//		Parent2 obj1 = new Parent2();		// 추상 클래스로 객체 생성X 
											// -> 미완성된 함수를 가지고 있기 때문에 안되여
		Son2 obj2 = new Son2();				// 추상메서드가 완성된 하위클래스에서는 객체 생성 가능
		Parent2 obj3 = new Son2();			// Son2의 객체가 Parent2의 obj3로 UpCasting
		obj3.func();
		
	}

}
