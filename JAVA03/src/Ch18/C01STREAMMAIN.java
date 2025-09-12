package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	public String name;
	public Integer age;
	

	// 디폴트 생성자
	public Person() {}
	
	
	// 모든인자 생성자
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	// getter and setter
	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

class Employee extends Person{
	public String department;
	public String role;
	
	//디폴트 생성자
	public Employee(){}
	public Employee(Person person) {
		this.name = person.getName();
		this.age = person.getAge();
		
		// Super(이름,나이)로 해도 위의 getName()하는 거랑 같음
	}

	// 모든 인자 생성자
	public Employee(String department, String role) {
		super();
		this.department = department;
		this.role = role;
	}
	
	// Getter and Setter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	// toString
	
	
}

public class C01STREAMMAIN {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);

		// Filter
		List<Integer> list1_1 = list.stream()
								.filter((n) -> {return n % 2 == 0;})
								.collect(Collectors.toList());
		System.out.println(list1_1);
		
		// Map -> 기존의 데이터를 재구성
		List<Integer> list3 =
		list.stream()
			.filter((n) -> {return n % 2 == 1;})
			.map((n) -> {return n * n;})
			.collect(Collectors.toList());
		System.out.println(list3);		// [1, 9, 25]
			
		// sorted
		List<Person> list4 = Arrays.asList(
						new Person("이노사마", 29),
						new Person("이인호", 29),
						new Person("헤렌보고시퍼", 27),
						new Person("헬렌", 27),
					new Person("우리헤렌", 27)
					);
		System.out.println(list4);
		
		// 나이순으로 내림차순 정렬해서 출력 .sorted((a, b) -> {return b - a;}) // 내림차순
		
		List<Person> list5 = 
				list4.stream()
			.sorted((a, b) -> {return b.getAge() - a.getAge();})
			.collect(Collectors.toList());
												
		list5.forEach(System.out::println);
		
		List<Integer> list6 =
		list4.stream()
			//.map((e) -> {return e.getAge();})
			//.map(e -> e.getAge())		// 위에 거 줄인 거
			.map(Person :: getAge)		// 위에거를 한 번 더 줄인거
			.collect(Collectors.toList());
		
		System.out.println(list6);
		
		System.out.println();
		
		//
		List<Integer> list7 =
				list4.stream()
				.map(Person :: getName)					//메서드 참조(::)이용 - Person
			.map(String :: length)					//메서드 참조(::)이용 - String
			.collect(Collectors.toList());
		System.out.println(list7);
			
		//
		List<Employee> list8 =
		list4.stream()
			// .map((el) -> {return new Employee(el);})
			.map(Employee :: new)
			.collect(Collectors.toList());
		
		
		list8.forEach(System.out :: println);
		
		// 새 객체 만들어서 뽑기(전체 정보 확인가능)
		List<Person> list100 = list4.stream()
								 .map(el -> new Person(el.getName(), el.getAge()))
		                        .collect(Collectors.toList());
		                        
		list100.forEach(System.out :: println);;

						
	}
}
