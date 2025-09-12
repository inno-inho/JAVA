package Ch01;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n = n;
	}
	
	@Override
	public boolean equals(Object obj) {			// 어떠한 클래스이든지 상관없이 Object의 클래스로 업캐스팅
		
		if(obj instanceof C02Simple) {			// 외부에서 받은 인자가 C02Simple의 객체라면
			C02Simple down = (C02Simple)obj;	// 다시 다운캐스팅
			return this.n == down.n;
		}
		return false;
	}
}



public class C02ObjectMain {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);

//		System.out.println(ob1.equals(ob1));
//		System.out.println(ob1.equals(ob2));
//		System.out.println(ob1.equals(ob3));
		
		System.out.println("---------------------");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}

}
