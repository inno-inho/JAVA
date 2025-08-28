package Ch05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class G02GUI extends JFrame{		// JFrame을 상속함으로써 밑에  쓴 메서드 전부 쓸 수 있게 됨
	G02GUI(String title){
		// Frame Setting
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Panel Setting
		JPanel panel = new JPanel();
		Color col = new Color(255,255,0);
		panel.setBackground(col);
		
		add(panel);		// Frame에 Panle 추가
		
		setVisible(true);
		
	}
}

public class C03SwingMain {

	public static void main(String[] args) {
		new G02GUI("세 번째 프레임 창입니다");

	}

}
