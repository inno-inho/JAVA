package Ch07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception{
//		String str = "문자 변환 스트림 사용!!";
//		
//		OutputStream out = new FileOutputStream("c:\\IOTEST\\test.txt");
//		OutputStreamWriter wout = new OutputStreamWriter(out);		// 바이트 자료형(OutputStream)을 문자형(OutputStreamWriter)으로 바꿔서 저장
//		BufferedWriter bout = new BufferedWriter(wout);
//		
//	
//		bout.write(str);
//		bout.flush();
//		bout.close();
		
		InputStream in = new FileInputStream("c:\\IOTEST\\test.txt");
		BufferedInputStream bin =  new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(bin);		// 바이트 자료형(InputStream)을 문자형(InputStreamReader)로 바꿈
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
			
		}
		
		
	}
}
