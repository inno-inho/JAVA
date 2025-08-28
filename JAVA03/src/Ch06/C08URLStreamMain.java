package Ch06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain {
	public static void main(String[] args) throws Exception{
		URL url = (new URI("https://n.news.naver.com/article/018/0006099310?iid=64")).toURL();
		InputStream in = url.openStream();
		
		// 보조스트림 추가
		BufferedInputStream buffIn = new BufferedInputStream(in); 	// 보조스트림(버퍼공간) 추가
		Reader rin = new InputStreamReader(buffIn);
		
		Writer fout =  new FileWriter("c:\\IOTEST\\index.html");
		
		while(true) {
			int data = rin.read();
			if(data == -1) {
				break;
			}else {
//				System.out.print((char)data);
				fout.write((char)data);
				fout.flush();
			}
			
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
	}
	
}
