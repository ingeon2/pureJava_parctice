package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true); //트루라서 이어지게 출력
		
		try(fos){
			byte [] bs = new byte[26];
			byte data = 65; //A아스키값
			
			for(int i = 0 ; i < bs.length ; i++) { //bs 배열에 65부터 집어넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs); //배열출력
			}
		catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("출력 끝");

	}

}
