package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) { //a.txt 없으니까 캣치문이 수행
			System.out.println(e); //예외 클래스(캣치)의 toString매서드 호출
		}
		
		System.out.println("여기도 수해오딥니다.");

	}

}
