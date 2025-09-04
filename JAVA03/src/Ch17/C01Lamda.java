package Ch17;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	private String addr;

	
	// 기본생성자
	
	public Person(){}
	
	// 모든인자 생성자
	
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// Getter and Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// toString()
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	

	
}

public class C01Lamda {

	public static void main(String[] args) {
		// 람다 함수
		// () -> {}
		// 스트림이랑 같이 많이 씀 stream().forEach(()->{})
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("이노", 29, "대구"));		
		list.add(new Person("헤렌", 27, "도쿄"));		
		list.add(new Person("이노와 헤렌", 2, "아오모리"));	
		
		list.stream().forEach((item)->{System.out.println(item);});
		System.out.println("---------------------------------");
		
		list.sort((a,b)->{return b.getAge()-a.getAge();});			// b-a는 내림차순, a-b는 오름차순
		list.stream().forEach((item)->{System.out.println(item);});		
		
		
	}

}
