package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
			
			FileOutputStream fos = new FileOutputStream("output3.txt", true); //트루라서 이어지게 출력
			
			
			byte [] bs = new byte[26];
			byte data = 65; //A아스키값
			for(int i = 0 ; i < bs.length ; i++) { //bs 배열에 65부터 집어넣기
				bs[i] = data;
				data++;
			}
			
			
			
			try(fos){
				fos.write(bs, 2, 10); //배열출력 bs의 두번째 자리부터 10개 입력하겠다!
				}
			catch(IOException e) {
				System.out.println(e);
			}
			
			System.out.println("출력 끝");


	}

}
