package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) { //read(byte[])�ż���� �迭�� ũ�⸸ŭ �Ѳ����� �ڷ� ����. ���⼱ 10���� �ڷ�����
				for(int k = 0 ; k < i ; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(i + "����Ʈ ����");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}