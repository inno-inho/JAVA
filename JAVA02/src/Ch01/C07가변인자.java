package Ch01;

class C07Simple{
	
	int sum(int ...arg) {		// 가변인자 -> 배열형태로 받는다
		System.out.println(arg);			// 인자를 배열형태로 받기깨문에 index번호로 호출가능
		System.out.println(arg);			// [I@5305068a 주소값 반환
		
		
		int s=0;
		for(int item : arg) {				// 배열형태로 받은 인자값을 향상된 for문으로 호출
			System.out.println(item);
			s+=item;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		
		C07Simple obj = new C07Simple();
						// 받는 값이 가변인자이기때문에 몇개를 넣든 상관이없다
	
		obj.sum(10, 20, 30, 40, 50);
		
	}

}
