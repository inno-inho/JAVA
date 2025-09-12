package Ch01;

import java.util.Objects;

class C03Simple{
	int n;
	C03Simple(int n){
		this.n = n;
	}
	
	@Override
	public boolean equals(Object obj) {			// 어떠한 클래스이든지 상관없이 Object의 클래스로 업캐스팅
		
		if(obj instanceof C03Simple) {			// 외부에서 받은 인자가 C02Simple의 객체라면
			C03Simple down = (C03Simple)obj;	// 다시 다운캐스팅
			return this.n == down.n;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(this.n);
	}
	
	
	
}



public class C03ObjectMain {

	public static void main(String[] args) {
		
		C03Simple ob1 = new C03Simple(10);
		System.out.println(ob1.toString());
		
		System.out.printf("%x \n", ob1.hashCode());


	}

}
