package stream.decorator;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader (new FileInputStream("reader.txt"))) {
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
//인풋스트림리더(보조스트림)로 스트림(파일인풋스트림)인데 한글 읽어올 수 있는것.
//원래 파일리더 사용하면되는데, 인풋스트림리더(보조스트림) 사용해보려고 이렇게 한것.