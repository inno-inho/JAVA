package Ch03;

class C04Person{
	String name;
	int age;
	// 디폴트 생성자
	C04Person(){}
	
	// 모든인자 생성자
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	};
	
}


public class C04ClassArrayMain {

	public static void main(String[] args) {
		// 배열 파트 중에서 제일 중요
		
		C04Person list[] = new C04Person[3];
		
		list[0] = new C04Person();		// 배열은 참조변수이기 때문에 각 객체를 연결해 주어야한다
		list[0].name = "이노";			 
		list[0].age = 29;
		
		list[1] = new C04Person();		// 배열은 참조변수이기 때문에 각 객체를 연결해 주어야한다
		list[1].name = "헤렌";			 
		list[1].age = 27;
		
		System.out.println(list[0]);

		
		
		
		
		
		
		
	}

}
