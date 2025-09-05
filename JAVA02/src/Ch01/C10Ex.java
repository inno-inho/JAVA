package Ch01;

class Person{
	private String name;
	private int age;
		
	// 모든인자 생성자
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}

public class C10Ex {
	
	public static void func1(int num) {		// 파라미터: Primitive(데이터값 저장),func1 method메모리에 저장
		System.out.println(num);
	}
	
	public static void func2(Object obj) {	// 파라미터(참조형 변수): Reference(주소값 저장)
		System.out.println(obj);
	}
	
	public static <T> Object func3(String name, int age) {
		
		return new Person(name, age);
	}
	
	
	public static void main(String[] args) {
		func1(10);
		func2(new Person("홍길동", 10));
//		Person a = new Person("", 16);
		
		Object ob = func3("헤렌!", 27);
		System.out.println(ob);
		
	}
}
