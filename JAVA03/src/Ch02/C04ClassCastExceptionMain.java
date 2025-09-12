package Ch02;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}


public class C04ClassCastExceptionMain {

	public static void main(String[] args) {
		
		Animal poppi = new Dog();	// 업캐스팅
		Animal tori = new Cat();	// 업캐스팅
		
		// Dog로 다운캐스팅
		try {
		Dog down1 = (Dog)poppi;		// 다운캐스팅 o
		Dog down2 = (Dog)tori;		// 다운캐스팅 안됨. tori는 Cat클래스의 객체였다
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	}

}
