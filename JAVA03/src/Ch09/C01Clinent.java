package Ch09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Clinent {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("192.168.5.20", 7000);	// IP: 192.168.5.2
															// 클라이언트 소켓생성 및 서버와의 연결
		
		InputStream in = client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("메세지: " + recv);
		
		din.close();
		in.close();
		client.close();
	}
}
