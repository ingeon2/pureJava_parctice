package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 적고 [Enter] 눌러라");
		
		int i;
		
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
