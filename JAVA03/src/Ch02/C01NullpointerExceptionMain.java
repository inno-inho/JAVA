package Ch02;

public class C01NullpointerExceptionMain {

	public static void main(String[] args) {
		
		try {
		String str = null;
		System.out.println(str.toString());
		}catch(NullPointerException e) {					// 예외객체 NullPointerException을 인자로 받는다면 예외처리를 하겠다
//			System.out.println("예외발생: " + e);
//			System.out.println(e.getCause());				// 이유
//			System.out.println(e.getStackTrace());
			e.printStackTrace();							// 빨간 에러메시지
		}
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");
		
		
	}
}
