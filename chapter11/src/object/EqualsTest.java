package object;


public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);  // 주소같은지를 체크 (물리적 동일성)
		System.out.println(str1.equals(str2)); //내용같은지를 체크 (논리적 동일성)
		
		System.out.println("=========해시코드========");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); //왜같을까? (논리적으로 같으면 해시코드도 같아야함. 자바에서의 정의!)	
		

	}

}
