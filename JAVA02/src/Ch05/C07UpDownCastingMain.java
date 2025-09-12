package Ch05;

class A{
	int a;

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	int b;

	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
	
}
class C extends A{
	int c;

	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}
	
}
class D extends B{
	int d;

	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}
	
}
class E extends B{
	int e;

	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}


	
}
class F extends C{
	int f;

	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}
	
}
class G extends C{
	int g;

	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}
	
}


public class C07UpDownCastingMain {
	public static void UpDownCastTestFunc(A obj) {		// 인자로 받는 건 제일 상위클래스 A의 객체 obj
		
		obj.a = 100;
		
		if(obj instanceof B) {		// 만약 obj가 B의 객체(인스턴스)라면
			B down = (B)obj;		// A의 객체 obj를 B클래스로 DownCasting
			down.b = 200;			// 파라미터로 들어갈 때 업캐스팅되었다가 다시 다운캐스팅되는거라 필드 b에도 접근 가능해짐
		}
		if(obj instanceof C) {
			C down = (C)obj;		// A의 객체 obj를 B클래스로 DownCasting
			down.c = 300;
		}
		if(obj instanceof D) {
			D down = (D)obj;
			down.d = 400;
		}
		if(obj instanceof E) {
			E down = (E)obj;
			down.e = 500;
		}
		
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		UpDownCastTestFunc(new A());
		UpDownCastTestFunc(new B());	// A의 하위클래스 B의 객체를 받으므로 UpCasting
		UpDownCastTestFunc(new C());	// A의 하위클래스 C의 객체를 받으므로 UpCasting
		UpDownCastTestFunc(new D());	// A의 하위클래스 B의 하위클래스 D의 객체를 받으므로 UpCasting
		UpDownCastTestFunc(new E());	// A의 하위클래스 B의 하위클래스 E의 객체를 받으므로 UpCasting
		
	}
}
