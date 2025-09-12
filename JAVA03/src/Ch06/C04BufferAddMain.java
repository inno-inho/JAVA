package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04BufferAddMain {

	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("c:\\IOTEST\\origin.txt");
		
		long startTime = System.currentTimeMillis();
		StringBuffer strBuffer = new StringBuffer();		// 문자를 하나씩 담을 곳
		
		
		int data;
		while((data = fin.read())!= -1) {		// read메서드가 받아온값을 int형으로 받기때문에 다시 문자열로 변환해야함	
      //	System.out.print((char)data);
			strBuffer.append((char)data);
		}
		System.out.println("총 길이: " + strBuffer.length());
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요 시간: " + (endTime - startTime) + "ms");
	}
}
