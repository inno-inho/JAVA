package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04BufferAddMainUseBuffer {

	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("c:\\IOTEST\\origin.txt");
		
		long startTime = System.currentTimeMillis();
		StringBuffer strBuffer = new StringBuffer();		// 문자를 하나씩 담을 곳
		
		char[] buff = new char[4096];	// 읽는 단위를 버퍼로 하기위해서
		
		while(true) {		
			int data = fin.read(buff);
			if (data == -1) {
				break;
			}
			strBuffer.append((char)data);
		}
		System.out.println("총 길이: " + strBuffer.length());
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요 시간: " + (endTime - startTime) + "ms");
	}
}
