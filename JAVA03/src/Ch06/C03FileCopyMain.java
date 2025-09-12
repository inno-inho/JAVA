package Ch06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {

		private static final String PATH = "c:\\IOTEST\\";
	
	public static void main(String[] args) throws Exception {
		
		// args[0] : 원본파일경로(원본파일명)
		// args[1] : 복사파일경로(복사파일명)
		
		Reader fin = new FileReader(PATH + args[0]);	// args[] == Run configuration에서 적을 인자들 -> 첫번째 인자의 파일을 읽고
		Writer fout = new FileWriter(PATH + args[1]);	// 두 번째 인자의 이름으로 파일을 쓰겠다
		// Reader로 받아서 Writer로 다시 보내는 작업 = Copy
		
		while(true) {
			int data = fin.read();
			if(data == -1) {		// 더 이상 읽을 데이터가 없다면
				break;
			}else {
			fout.write((char)data);
			fout.flush();
			}
		}
		fout.close();
		fin.close();
	}

}
