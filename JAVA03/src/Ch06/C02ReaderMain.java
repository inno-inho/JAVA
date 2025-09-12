package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("c:\\IOTEST\\test1.txt");
		
//		while(true) {		// read메서드가 받아온값을 int형으로 받기때문에 다시 문자열로 변환해야함
//			int data = fin.read();
//			if(data == -1) {		// 읽을 게 없다면 이 반복문 종료
//				break;
//			}
//			System.out.print((char)data);
//		}
		
		// 이렇게도 가능(위의 식)
		int data;
		while((data = fin.read())!= -1) {		// read메서드가 받아온값을 int형으로 받기때문에 다시 문자열로 변환해야함	
			System.out.print((char)data);
		}
		
		fin.close();
	}

}
