package Ch05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class G04GUI extends JFrame{		// JFrame을 상속함으로써 밑에  쓴 메서드 전부 쓸 수 있게 됨
	G04GUI(String title){
		// Frame Setting
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Panel Setting
		JPanel panel = new JPanel();
		panel.setLayout(null);
		Color col = new Color(25,255,0);
		panel.setBackground(col);
		
		// Component Setting
		JButton btn1 = new JButton("BTN01");
		btn1.setBounds(10, 10, 100, 30);
		JButton btn2 = new JButton("BTN02");
		btn2.setBounds(120, 10, 100, 30);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10, 50, 210, 30);
		
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10, 90, 210, 300);
		
		JScrollPane scroll1 = new JScrollPane(area1);	// area1을 품고있는 스크롤창
		scroll1.setBounds(10, 90, 210, 300);
		
		// Panel에 Component 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1);
		
		add(panel);		// Frame에 Panle 추가
		
		// Frame 표시 여부
		setVisible(true);
		
		
	}
}

public class C04SwingMain {

	public static void main(String[] args) {
		new G04GUI("네 번째 프레임 창입니다");

	}

}
