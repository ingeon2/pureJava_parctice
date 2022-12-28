package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
			} 
			catch(FileNotFoundException e) { //a.txt 없으니까 캣치문이 수행
				System.out.println(e); //예외 클래스(캣치)의 toString매서드 호출
				return;
			} 
			finally {
				if( fis != null) {
					try {
						fis.close();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
				System.out.println("항상 수행됩니다.");

			}
			
			System.out.println("여기도 수해오딥니다.");


	}

}
