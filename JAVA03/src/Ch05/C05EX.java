//package Ch05;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//class GUI extends JFrame{
//	GUI(String title){
//		// Frame Setting
//		super(title);
//		setBounds(100, 100, 370, 420);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		// Panel Setting
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(null);
//		
//		// Component Setting
//		
//		JTextArea area1 = new JTextArea();
//		JScrollPane scroll1 = new JScrollPane(area1);
//		scroll1.setBounds(10, 10, 210, 300);
//		
//		JTextField txt1 = new JTextField();
//		txt1.setBounds(10, 320, 210, 40);
//		
//		JButton btn1 = new JButton("파일로 저장");
//		btn1.setBounds(230, 10, 105, 40);
//		JButton btn2 = new JButton("1:1 요청");
//		btn2.setBounds(230, 60, 105, 40);
//		JButton btn3 = new JButton("대화기록");
//		btn3.setBounds(230, 110, 105, 40);
//		JButton btn4 = new JButton("입력");
//		btn4.setBounds(230, 320, 105, 40);
//		
//		// panel에 Component 추가
//		panel.add(scroll1);
//		panel.add(txt1);
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//		
//		
//		
//		// Frame에 panel 추가
//		add(panel);
//		
//		// Frame 표시 여부
//		
//		setVisible(true);
//	}
//}
//
//
//public class C05EX {
//
//	public static void main(String[] args) {
//		new GUI("Chatting Server");
//
//	}
//
//}
