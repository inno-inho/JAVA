package Ch06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutStreamMain {

	public static void main(String[] args) throws Exception {
		OutputStream fout = new FileOutputStream("c:\\IOTEST\\test6.txt");
		
//		fout.write('가');			// 한글문자는 2byte정도로 나뉘어지기때문에 byteStream으로 전달할려면 잘리고만다
		fout.write("가나다".getBytes(StandardCharsets.UTF_8)); 	// 문자열을 객체로 받은다음 바이트단위로 받아서 처리
		
		fout.write('a');
		fout.write('b');
		fout.write('c');
		
		fout.flush();
		fout.close();
	}

}
