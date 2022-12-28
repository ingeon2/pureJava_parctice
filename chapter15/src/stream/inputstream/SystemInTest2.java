package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 누르고 엔터 누르셈");
		
		int i;
		
		
		try {
			while((i = System.in.read()) != '\n') { //   '입력받은 i가 엔터키가 아니다' 가 트루일때까지
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
