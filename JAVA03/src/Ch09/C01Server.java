package Ch09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class C01Server {
	
	public static void main(String[] args) throws IOException {
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);		// IP: 192.168.5.50, 	 PORT: 7000
															// 소켓 생성, 그리고 연결
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		// 1회 접속
		Socket client = server.accept();		// 만든 소켓 클라이언트에 접속
//		OutputStream out = client.getOutputStream();	// 밖으로 내용빼냄
//		DataOutputStream dout = new DataOutputStream(out);	
//		System.out.println("접속자 IP: " + client.getInetAddress());
//		dout.writeUTF("[SERVER] Welcome to server" + new Date());
//		dout.flush();
		
		// 루프접속
		while(true) {
			Socket client = server.accept();
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			System.out.println("접속자 IP: " + client.getInetAddress());
			dout.writeUTF("[SERVER] Welcome to server" + new Date());
			dout.flush();
			dout.close();
			out.close();
			client.close();
		}
		

		server.close();
		
		System.out.println("[INFO] Server Exit");
	}
}
