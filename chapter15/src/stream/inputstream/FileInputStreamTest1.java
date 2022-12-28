package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) { //그냥 맨 상위클래스Exception갈겨도 되는데, 어떤 예외인지 구분 잘 하기 위해 이런식으로 사용.
				System.out.println(e); 		 //Exception 위치 틀려도 에러나옴
			}
		}
			System.out.println("end");
	}

}
//인풋 텍스트 없을때는 트라이 안되고, 17행과 25행의 캐치에 걸림
//지금은 인풋 텍스트 만들어서 ABC넣은 상태, 출력은 ABC의 아스키코드값나옴.