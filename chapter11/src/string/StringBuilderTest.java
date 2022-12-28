package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("바보");
		
		System.out.println("String형의 str1의 주소는 " + System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println("StringBuilder형의 str1의 주소는 " + System.identityHashCode(buffer));
		
		buffer.append("똥개");
		buffer.append("몽총이");
		System.out.println("StringBuilder에서 추가해도 주소는 " + System.identityHashCode(buffer) + " 로 그대로임.(장점)");
		
		String str2 = buffer.toString();
		System.out.println("str2는 " + str2);
		System.out.println("StringBuilder를 String형 str2으로 할당한 주소는 " + System.identityHashCode(str2));
		

	}

}
