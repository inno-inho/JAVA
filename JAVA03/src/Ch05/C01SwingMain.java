package Ch05;

import javax.swing.JFrame;

public class C01SwingMain {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("첫 번째 프레임입니다");
		frame.setBounds(100, 100, 500, 500);		// 위치 잡기-> x축(100) y축(100) width(500) height(500)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 누르면 백그라운드에서도 꺼지게하는 기본 코드
		frame.setVisible(true);
		
	}
}
