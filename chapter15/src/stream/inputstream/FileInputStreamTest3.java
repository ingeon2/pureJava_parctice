package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) { //read(byte[])매서드는 배열의 크기만큼 한꺼번에 자료 읽음. 여기선 10개씩 자료읽음
				for(int k = 0 ; k < i ; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(i + "바이트 읽음");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}
