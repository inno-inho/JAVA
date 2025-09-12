package Ch06;

import java.util.Scanner;

public class C02SWITCH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ranking = sc.nextInt();
		char medalColor;
		switch (ranking) {
			case 1:											// ranking이 1이라면
				medalColor = 'G';
				System.out.println("메달색상 : G");
//				break;
			case 2:											// ranking이 2라면
				medalColor = 'S';
				System.out.println("메달색상 : S");
//				break;
			case 3:											// ranking이 3라면
				medalColor = 'B';
				System.out.println("메달색상 : B");
//				break;
		default:											// 그 외의 경우라면
				medalColor = 'C';
				System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 " + medalColor + " 입니다.");
	}
}
