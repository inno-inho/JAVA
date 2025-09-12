package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) throws IOException {
//		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt");		// 윈도우는 \\로 경로 나타내지만 리눅스는 //임
																	// ()안은 경로 설정, 두 번째 인자는 기본값이 false == 앞에 것 저장안되고 덮어쓰기 됨
																	// test1은 없으면 만들어줌 
		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt", true);		// ()안은 경로 설정, 추가하기(덮어쓰기 X)
		fout.write("TEST1_!\n");
		fout.write("TEST2_!\n");	
		fout.write("TEST3_!\n");
		
		fout.flush();
		fout.close();
	}

}
