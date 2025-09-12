package Ch03;

class Box <A, B>
{
	A ob1;
	B ob2;
	Box(A ob1, B ob2){
		this.ob1 = ob1;
		this.ob2 = ob2;

	}
	@Override
	public String toString() {
		return "Box [ob1=" + ob1 + ", ob2=" + ob2 + "]";
	}

class Student{
	String name; 
	String major;
	Integer level;
	
	
	public Student(String name, String major, Integer level) {
		super();
		this.name = name;
		this.major = major;
		this.level = level;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", level=" + level + "]";
	}
	
	
	
}
	
}

public class C06Ex_Generic {
	
	public static <T> T print2(T box, int...age) {
		System.out.println(ob);
		System.out.println();
	}
	
	public static void main(String[] args) {
		print(10);
		print("홍길동");
		print(new Student("홍길동", "킴공"));
		// Box
		Box<Integer, Integer> ob1 = new Box(10, 20);		// 숫자 들어감
		System.out.println(ob1);
		
		Box<String, String> ob2 = new Box("홍길동", "이인호");		// 문자열도 들어감
		System.out.println(ob2);
		
		// Box
//		Box<Student, Student>ob3 = new box(new Student("홍길동", "컴공", 1));
//		System.out.println(ob3);
	}
}
