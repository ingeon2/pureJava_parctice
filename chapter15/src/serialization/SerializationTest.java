package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionID = -1503252402544036183L;
	String name;
	transient String job; //직렬화에서 이 변수는 뺄게요! 라는 의미
	

	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + " , " + job;
	}
	
}



public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person personAhn = new Person("안재용", "대표");
		Person personKim = new Person("김철수", "상무");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos))//try 여기까지 
		{
			oos.writeObject(personAhn); //여기가 직렬화 (인스턴스의 실시간 정보를 바이트 정보 스트림으로 저장. 시리얼.아웃 으로 저장)
			oos.writeObject(personKim);
				
		}
		catch(IOException e) {
			System.out.println(e);
		} 
		
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis))//try 여기까지 
			{
				Person p1 = (Person)ois.readObject();
				Person p2 = (Person)ois.readObject(); //여기가 역직렬화 (직렬화한 정보를 해독)
				
				System.out.println(p1);
				System.out.println(p2);
					
			}
			catch(IOException e) {
				System.out.println(e);
			} 
		
	}

}
