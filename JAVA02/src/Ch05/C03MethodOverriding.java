package Ch05;

//  함수재정의(Method Overriding)
// 	상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(고쳐사용)하는 것을 허용한 문법
// 	메서드의 헤더부분은 동일하고 두고  본체({})의 로직을 수정하게끔 허용함으로 다양한 형태의 객체가 
//	형성될 수 있도록 유도(다형성)
// 	상위클래스로부터 동일한 메서드를 물려받더라도 각 하위클래스마다 
// 	다른 기능 구현의 결과물을 만들어 낼 수 있다

//	오버로딩 VS 오버라이딩

// 	오버로딩?
//	상속안해도 쓸 수 있음
// 	함수헤더변경(함수이름 중복허용, 파라미터는 다양하게 허용, 반환자료형 바꾸는 거 안됨)
//	개발자의 편의성에 중점(함수이름 단일화)

// 	오버라이딩?
//	상속전제o
// 	함수본문변경(헤더 고정)
//	다형성(같은 메서드명 다른 역할)을 목적으로 한 문법요소



class Animal {
	void sound() {
		System.out.println("소리낸다...");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("왈왈!...");			// sound()함수 재정의
	}
}

class Cat extends Animal{

	@Override									// 오버라이딩도 source안에서 클릭해서 처리가능
	void sound() {
		System.out.println("ニャン！");
	}
	
}



public class C03MethodOverriding {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println("===========================");
		
		animal = dog;		// 상위클래스형 참조변수에 하위객체를 연결 -> 업캐스팅
							// 자료형은 다르지만 컴파일에서 알아서 자동형변환해줌(왼쪽 자료형으로 맞춤)
		animal.sound();		//	왈왈!...	-> 하위객체 Dog이 재정의한 sound() 값이 나오게됨
							// 	상위객체가 sound()함수를 갖고있고 하위객체가 sound()함수를 재정의할때만 가능
		animal = cat;
		animal.sound();		//	ニャン！ -> Cat에서 재정의한 sound()함수
		
//		하위객체에서 추가한 속성/기능에 접근할 수 있다? X ->(instanceof) 다운캐스팅
//		하위객체에서 재정의한 기능에 접근할 수 있다? O
	}

}
