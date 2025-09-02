package Ch10;

public class C02ThreadMain {

	public static void main(String[] args) {
		
		// 01
		C02Worker1 w1 = new C02Worker1();		// Worker1 객체 만들기
		C02Worker2 w2 = new C02Worker2();		// Worker2 객체 만들기
		
		// 02
		Thread th1 = new Thread(w1);		// worker1을 실행하는 thread생성
		Thread th2 = new Thread(w2);		// worker1을 실행하는 thread생성
		
		// 03
		th1.start();		// 한 개씩 실행하게됌
		th2.start();		// TASK02... TASK01... TASK02... TASK01...
		
		// Thread class를 바로 이용한 스레드 분할
		
		new Thread() {	// 익명함수

			@Override
			public void run() {
				for(int i =0; i < 5; i++) {
					System.out.println("TASK03...");
					
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}		
		
		}.start();
		
	}
}
