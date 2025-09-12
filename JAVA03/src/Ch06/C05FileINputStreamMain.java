package Ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05FileINputStreamMain {

	public static void main(String[] args) throws Exception {
		
		InputStream fin = new FileInputStream("c:\\IOTEST\\응용SW기초기술활용.pptx");
		
		while(true) {
			int data = fin.read();
			if(data == -1) {
				break;
			}
			System.out.println(data);
		}

	}

}
