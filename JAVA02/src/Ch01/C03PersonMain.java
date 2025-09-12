package Ch01;



class C03Person {
	// 속성
	public String name;
	public int age;
	public float height;
	public double weight;
		
	// 기능

	void talk() {System.out.printf("%s님이 말합니다.\n", this.name);}
	void walk() {System.out.printf("%s님이 걷습니다.\n", this.name);}
	void showInfo() {
		System.out.printf("%s %d %f %f\n", this.name, this.age, this.height, this.weight);
	}
	
	
	// toString
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}

public class C03PersonMain {

	public static void main(String[] args) {
		
		C03Person hong = new C03Person();
		hong.name = "이노";
		hong.age = 30;
		hong.height = 179.5f;
		hong.weight = 80.5;
		
//		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		
		hong.talk();
		hong.walk();
		hong.showInfo();

		System.out.println(hong);
		
	}

}
