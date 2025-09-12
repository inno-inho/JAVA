package Ch01;

public class C04WrapperMain {

	public static void main(String[] args) {
		// Boxing(기본자료형 -> Wrapper Class)
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("100");
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1 + ob2 + ob3);	// 자료형이 다르지만 Wrapper클래스적용시키니까 연산이 가능해짐
		
		// UnBoxing
		int n1 = ob1.intValue();		// 객체타입으로 변환시킨걸 다시 원시타입의 자료형 int로 변환
		int n2 = ob2.intValue();
		int n3 = ob3.intValue();
		System.out.println(n1 + n2 + n3);

		// Auto Boxing
		Integer ob4 = 100;		// 사실 그냥 자동으로 다 wrapping 해줘요
		
		int n4 = ob1 + ob2 + ob3 + ob4;
	}

}
