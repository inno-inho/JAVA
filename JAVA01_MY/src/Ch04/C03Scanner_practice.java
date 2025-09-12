package Ch04;

import java.util.Scanner;

public class C03Scanner_practice {

	public static void main(String[] args) {

		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 수성구
		// 홍길동 님의 나이는 35세 주소는 대구광역시 수성구입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요?");
		String name = sc.next();
		
		System.out.printf("%s님의 나이를 입력하세요?", name);
		int age = sc.nextInt();
		
		System.out.printf("%s님의 주소를 입력하세요?", name);
		sc.nextLine();		// 엔터치면 인식될거 생각해서
		String addr = sc.nextLine();
		
		System.out.printf("%s님의 나이는 %d세 주소는 %s입니다.", name, age, addr);
		
		
		sc.close();
		
		
		
		
	}

}
