package Ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05FileINputStreamMainUsingBuffer {

	public static void main(String[] args) throws Exception {
		
		InputStream fin = new FileInputStream("c:\\IOTEST\\응용SW기초기술활용.pptx");
		
		StringBuffer stringBuffer = new StringBuffer();
		long startTime = System.currentTimeMillis();
		byte[]  buff = new byte[4096];
		while(true) {
			int data = fin.read();
			if(data == -1) 
				break;
			stringBuffer.append((char)data);
			
		System.out.println("총길이: " + stringBuffer.length());
		fin.close();
			
		long endTime = System.currentTimeMillis();
		System.out.println(data);
		}

	}

}
