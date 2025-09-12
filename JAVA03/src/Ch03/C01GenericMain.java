package Ch03;


class 호빵재료{
	
}

class 팥 extends 호빵재료{

	@Override
	public String toString() {
		return "단팥";
	}
}

class 슈크림 extends 호빵재료{

	@Override
	public String toString() {
		return "슈크림";
	}
	
}

class 야채 extends 호빵재료{

	@Override
	public String toString() {
		return "야채";
	}
	
}


class 호빵 <T extends 호빵재료>{	// <T>는 호빵의 매개변수, 사용시 실제 타입을 지정함 
								// 상속을 걸게 되면 그 상위클래스에  상속되어있는 하위클래스(자료형)만 들어올 수 있게 됨
	private T 재료;
	
	public 호빵(T 재료) {
		this.재료 = 재료;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "호빵 [재료=" + 재료 + "]";
	}

}

class 민트초코{

	@Override
	public String toString() {
		return "민트초코";
	}

}

public class C01GenericMain {

	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥());
		System.out.println(ob1);
		
		호빵<슈크림> ob2 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob2);
		
		호빵<야채> ob3 = new 호빵<야채>(new 야채());
		System.out.println(ob3);
		
//		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코());
//		System.out.println(ob4);
		
	}

}
