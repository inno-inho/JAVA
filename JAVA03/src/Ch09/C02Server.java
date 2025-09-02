package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {
	public static void main(String[] args) throws Exception {
		
		// 1. 키보드 입력(Server)
		// 2. dout.write(Server)
		// 3. din read(client)
		// 4. dout.read(client)
		// 5. din.read(server)
		
		//
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] server socket listening");
		
		//
		Socket client = server.accept();
		System.out.println("[INFO] Server Accept... Client IP: " + client.getInetAddress());
		
		// 
		InputStream in = client.getInputStream();			// Byte스트림
		OutputStream out = client.getOutputStream();
		
		// 보조스트림
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		// 
		Scanner sc = new Scanner(System.in);
		String recv = null;		// 수신용
		String send = null;		// 송신용

		while(true) {
			//  키보드입력
			System.out.print("[Server] (q: 종료):");
			send = sc.nextLine();
			
			// Server -> Client(송신)
			// 써진 거 client에게 전달
			dout.writeUTF(send);
			dout.flush();
			
			if(send.equals("q"))	// q누르면 종료  
				break;
			
			// Client -> Server(수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[Client]: " + recv);
			
		}
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();
		
		System.out.println("[Server]연결 종료합니다");
	}
}
