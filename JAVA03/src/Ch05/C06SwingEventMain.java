//package Ch05;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//class GUI extends JFrame implements ActionListener{
//		JButton btn1;
//		JButton btn2;
//		JButton btn3;
//		JButton btn4;
//		public GUI(String title){
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
//		btn1 = new JButton("파일로 저장");
//		btn1.setBounds(230, 10, 105, 40);
//		btn2 = new JButton("1:1 요청");
//		btn2.setBounds(230, 60, 105, 40);
//		btn3 = new JButton("대화기록");
//		btn3.setBounds(230, 110, 105, 40);
//		btn4 = new JButton("입력");
//		btn4.setBounds(230, 320, 105, 40);
//		
//		// Event 처리
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
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
//
//		@Override
//		public void actionPerformed(ActionEvent e) {	// 이벤트가 발생되면 그걸(ActionEvent e) 받아서 확인
////			System.out.println("BTN 클릭" + e.getSource());
//			if(e.getSource() == btn1) {		// 눌려진게 btn1이라면
//				System.out.println("파일로 저장 버튼 클릭");
//			}else if(e.getSource() == btn2) {		// 눌려진게 btn2라면
//				System.out.println("1:1 요청 버튼 클릭");
//			}else if(e.getSource() == btn3) {		// 눌려진게 bt32라면
//				System.out.println("대화 기록 보기 버튼 클릭");
//			}else if(e.getSource() == btn4) {		// 눌려진게 bt42라면
//				System.out.println("입력 버튼 클릭");
//			}
//		}
//			
//		
//}
//
//
//public class C06SwingEventMain {
//
//	public static void main(String[] args) {
//		new GUI("Chatting Server");
//	
//
//	}
//
//}
