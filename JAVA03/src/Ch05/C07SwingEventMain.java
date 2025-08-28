package Ch05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame implements ActionListener, KeyListener, MouseListener{
		JButton btn1;
		JButton btn2;
		JButton btn3;
		JButton btn4;
		
		JTextArea area1; 
		JTextField txt1;
		
		public GUI(String title){
		// Frame Setting
		super(title);
		setBounds(100, 100, 370, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel Setting
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		// Component Setting
		
		area1 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 10, 210, 300);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 320, 210, 40);
		
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(230, 10, 105, 40);
		btn2 = new JButton("1:1 요청");
		btn2.setBounds(230, 60, 105, 40);
		btn3 = new JButton("대화기록");
		btn3.setBounds(230, 110, 105, 40);
		btn4 = new JButton("입력");
		btn4.setBounds(230, 320, 105, 40);
		
		// Event 처리
		btn1.addActionListener(this);		// 각각의 이벤트가 일어나는걸 감시하는 Listner생성
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		txt1.addKeyListener(this);
		
		area1.addMouseListener(this);
		
		// panel에 Component 추가
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		
		
		// Frame에 panel 추가
		add(panel);
		
		// Frame 표시 여부
		
		setVisible(true);
	}
		// 클릭 이벤트
		@Override
		public void actionPerformed(ActionEvent e) {	// 이벤트가 발생되면 그걸(ActionEvent e) 받아서 확인
//			System.out.println("BTN 클릭" + e.getSource());
			if(e.getSource() == btn1) {		// 눌려진게 btn1이라면
				System.out.println("파일로 저장 버튼 클릭");
			}else if(e.getSource() == btn2) {		// 눌려진게 btn2라면
				System.out.println("1:1 요청 버튼 클릭");
			}else if(e.getSource() == btn3) {		// 눌려진게 bt3라면
				System.out.println("대화 기록 보기 버튼 클릭");
			}else if(e.getSource() == btn4) {		// 눌려진게 bt4라면
				System.out.println("입력 버튼 클릭");
			}
		}

		
		// 키보드 이벤트
		@Override
		public void keyTyped(KeyEvent e) {			// 눌렀다가 뗏을 때		
//			System.out.println("KeyTyped: " + e.getKeyChar());
//			System.out.println("KeyTyped: " + e.getKeyCode());
			
		}

		@Override
		public void keyPressed(KeyEvent e) {		// 사용자가 키를 누르는 순간
//			System.out.println("KeyPressed: " + e.getKeyChar());
//			System.out.println("KeyPressed: " + e.getKeyCode());	// enter키에 대한 keycode는 10
			
			if(e.getKeyCode()==10) {		// enetr키를 쳤을 때
				String message = txt1.getText();	// txt1에 써진 메세지를 문자열로 받아오는 getText()
				area1.append(message + "\n");		// area1에 메세지랑 줄 바꿈 붙히고
				txt1.setText("");					// txt1은 비워져라
			}
			
		}
		
		@Override				
		public void keyReleased(KeyEvent e) {		// 사용자가 타자에서 손을 떼는 순간
//			System.out.println("KeyReleased: " + e.getKeyChar());
//			System.out.println("KeyReleased: " + e.getKeyCode());				
		}

		
		// 마우스이벤트
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
			System.out.println("마우스 클릭됨");
			int offset = area1.viewToModel(e.getPoint());	// 클릭한 곳이 어디인지 특정하는 코드
			System.out.println("offset: " + offset);
			int row = area1.getLineOfOffset(offset);	//	area1에서 offset이 몇번째 줄인지 확인하는 코드
			System.out.println("row: " + row);
			int startOffset = area1.getLineStartOffset(row);	// row에서 시작점에 있는 위치(offset)획득
			int endOffset = area1.getLineEndOffset(row);	// row에서 끝점에 있는 위치(offset)획득
			System.out.printf("Start: %d - End: %d\n", startOffset, endOffset);
			String str = area1.getText(startOffset, endOffset - startOffset);	// getText(시작위치, 길이) -> startoff셋에서 시작해서 
																				// endOffset에서 startOffset의 길이를 뺀만큼 저장(그 줄 전체가 됨)
			
			System.out.println("str: " + str);
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
			
		
}


public class C07SwingEventMain {

	public static void main(String[] args) {
		new GUI("Chatting Server");
	

	}

}
