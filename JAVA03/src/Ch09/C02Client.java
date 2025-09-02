package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {
	public static void main(String[] args) throws Exception {
		//
		Socket client = new Socket("192.168.5.3", 7000);
		System.out.println("Server와 연결되었습니다");
		
		//
		InputStream in = client.getInputStream();			
		OutputStream out = client.getOutputStream();
	
		//
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		// 
		Scanner sc = new Scanner(System.in);
		String recv = null;		// 수신용
		String send = null;		// 송신용

		while(true) {
			
			
			// Server -> Client(수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[Server]: " + recv);
			
			//  키보드입력
			System.out.print("[Client] (q: 종료):");
			send = sc.nextLine();
			
			// Server -> Client(송신)
			// 써진 거 client에게 전달
			dout.writeUTF(send);
			dout.flush();
			
			if(send.equals("q"))	// q누르면 종료  
				break;
		}
		
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		
		System.out.println("[Client]연결 종료합니다");
	}
}
