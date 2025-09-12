package Ch04;

class C02Simple{
	static int n1;
	int n2;
	
	void func1() {
		n1 = 100;
		n2 = 200;
	}
	static void func2() {		
		n1 = 300;
//		n2 = 400;			// static은 실행과 동시에 먼저 만들어진다. 그런데 n2는 객체를 생성할시 만들어지는 멤버변수이다. 
							// 그렇기때문에 순서상 func2()가 만들어지지도 않았는데 멤버변수 n2가 있다는 건 말이 안되는거기 때문에 오류발생
	}

}


public class C02StaticMain {

	public static void main(String[] args) {
		
		

	}

}
