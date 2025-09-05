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
}

public class C06Ex_Generic {
	
	public static void main(String[] args) {
		// Box
		Box<Integer, Integer> ob1 = new Box(10, 20);
		System.out.println(ob1);
		
		Box<String, String> ob2 = new Box("홍길동", "이인호");
		System.out.println(ob2);
	}
}
