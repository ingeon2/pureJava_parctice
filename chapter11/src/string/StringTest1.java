package string;

public class StringTest1 {
	

	public static void main(String[] args) { //스트링 뉴 와 스트링 상수 차이점
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); //new 해서 생성된 두개의 동일논리의 인스턴스의 주소는 다르다
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // 상수로 생성된 두개의 인스턴스는 주소가 같다 (abc자체에 할당되기 때문)

	}

}
