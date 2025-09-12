package Ch04;

// Static: 공유 메모리(클래스 == 메서드 영역)에 변수/메서드 적재, 객체생성과는 무관하게 공간 할당, 클래스명으로 접근가능
//			객체들간의 공유 변수

class C01Simple{
	
	static int n1;
	int n2;
	// 디폴트 생성자
	public C01Simple(){}
	
	// 모든 인자 생성자
	public C01Simple(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "C01Simple [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}


public class C01StaticMain {

	public static void main(String[] args) {
		
		C01Simple.n1 = 100;
		System.out.println(C01Simple.n1);
		
		C01Simple ob1 = new C01Simple(); 
		ob1.n1 = 300;
		C01Simple ob2 = new C01Simple(); 
		
		System.out.println("ob1: " + ob1);		// n1은 공용변수이기때문에 ob1에서 바꾼 n1의 값이 ob2의 n2값에도 영향끼침
		System.out.println("ob2: " + ob2);

	}

}
