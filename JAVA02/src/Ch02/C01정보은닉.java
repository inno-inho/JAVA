package Ch02;

	//접근 한정자
	// 멤버 / 클래스의 접근범위를 제한을 위한 예약어
	// public 		: 모든 클래스에서 접근가능
	// private		: 해당 클래스에서만 접근가능
	// protected	: 상속 관계를 가지는 경우에 접근 가능
	// default(기본)	: 동일 패키지에 속한 클래스에서 접근가능

class C01Person{
	String name;
	private int age;		// age를 private 한정자로 설정
	private String addr;
	
	// 기능
	
	// setter 함수 (기존데이터를 수정)
	public void setAge(int age) {		// private먹인 age의 데이터를 수정하기 위한 setter함수
		this.age = age;
	}
	
	// getter 함수(데이터를 외부로 반환)
	public int getAge() {				// 가지고 있는 데이터를 보는거기 때문에 반환자료형은 원하는 데이터와 같은 자료형
		return this.age;				
	}
	
	public String getAddr() {			// source -> generate setter getter가 있음
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	
	// 디폴트 생성자
	

	public C01Person() {}
	
	// 모든인자 생성자
	
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	// toString 재정의
	
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	
	
	
	
	
	
	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		
		C01Person person1 = new C01Person("이노", 30, "대구");
		person1.setAge(33);				// private된 나이를 수정하기위한 setter함수 setAge를 써서 객체 person1의 나이를 수정함
		
		System.out.println(person1.getAge());
		
		
	}

}
