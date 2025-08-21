package Ch04;

class Company{
	int n1;
	int n2;
	// 싱글톤 패턴
	private static Company instance;
	private Company() {}; // 외부에 객체 생성 불가능, 클래스 내부에서만 객체 생성가능 
	public static Company getInstance() {
		if(instance == null)				// 만약 객체가 생성되있지 않다면
			instance = new Company();		// 처음 Company 객체를 호출 할 시 딱 1번만 생성하도록 하는 코드문
		return instance;					// 항상 같은 객체를 반환 
	
	}
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	//toString 재정의
	
}

public class C03SingletonePattern {				// singletone: 하나의 함수에 하나의 객체만

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company com1 = Company.getInstance();		// 아직 instance가 만들어지지않았기 때문에 새 company() 객체 생성
		Company com2 = Company.getInstance();		// 이미 instance 있음, 새로운 객체 생성하지 않고 기존객체를 반환값으로 받음. com2도 com1이랑 같은 객체 참조
	
		com1.n1 = 100;					// com1과 com2의 n1값을 100으로 공유
		com2.n2 = 200;					// com1과 com2의 n2값을 200으로 공유
		
		System.out.println("com1: " + com1);
		System.out.println("com2: " + com2);
	}

}
