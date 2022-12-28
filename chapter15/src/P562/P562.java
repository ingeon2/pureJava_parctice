package P562;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P562 {

	public static void main(String[] args) {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));){
			osw.write("박은종 선생님 지금까지 고생하셨습니다");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
