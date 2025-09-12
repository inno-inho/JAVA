package Ch05;

import javax.swing.JFrame;

class G02GUI extends JFrame{		// JFrame을 상속함으로써 밑에  쓴 메서드 전부 쓸 수 있게 됨
	G02GUI(String title){
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C02SwingMain {

	public static void main(String[] args) {
		new G02GUI("두 번째 프레임 창입니다");

	}

}
