package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i = fis.read()) != -1) { //'fis에서 읽어가져온것이 i' 이렇게 이해해야함 fis.read()는 바이트대로 0번째,1번째 이런식으로 읽어옴 (테스트1가서 보기)
				System.out.println((char)i);
				}
			System.out.println("end");
			} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			}
		catch (IOException e) {
			System.out.println(e);
			}
		

	}

}
