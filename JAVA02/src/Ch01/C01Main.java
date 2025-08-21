package Ch01;

public class C01Main {

	public static void main(String[] args) {
		C01Person hong = new C01Person();
		hong.name = "이노";
		hong.age = 30;
		hong.height = 179.5f;
		hong.weight = 80.5;
		
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		
		

	}

}
