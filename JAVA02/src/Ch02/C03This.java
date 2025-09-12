package Ch02;

// this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보(메모리주소-해쉬코드값)을 확인하는데 사용

// this: 멤버변수와 지역변수 구별에 사용
// this: 다른 생성자 호출 사용

class C03Simple{
	// 속성
	int x;
	int y;
	
	C03Simple(){
		this(0, 0);		// 인자를 2개받는 생성자로 가서 거기의 코드를 수행한 후 다시 돌아와서 여기의 밑의 코드를 수행
		System.out.println("C03Simple() 호출");
	}
	
	C03Simple(int x){
		this.x = x;			// 멤버변수 this.x에 C03Simple의 X값을 대입
//		this(x, 0);			// 인자를 2개받는 생성자로 가서 거기의 코드를 수행한 후 다시 돌아와서 여기의 밑의 코드를 수행
		System.out.println("C03Simple(int x) 호출");
	}
	C03Simple(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("C03Simple(int x, int y) 호출");
	}
	
	
	// 기능
	public C03Simple getThis() {			// getter 함수
		return this;
	}
}

public class C03This {

	public static void main(String[] args) {
		
		C03Simple ob1 = new C03Simple();
//		System.out.println(ob1);
//		System.out.println(ob1.getThis());
//
//		C03Simple ob2 = new C03Simple();
//		System.out.println(ob2);
//		System.out.println(ob2.getThis());
//		
	}

}
