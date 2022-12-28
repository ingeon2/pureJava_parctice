package readerwriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("writer.txt");) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D'};
			
			fw.write(buf);
			fw.write("음 잘써지는구먼");
			fw.write(buf, 1, 2); //문자열의 일부 출력
			fw.write("65");
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
