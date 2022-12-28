package string;

public class StringTest2 {

	public static void main(String[] args) { // 문자열 연결하기 (아래와 같이 String 콘캣하면 java와 같은 쓰레기 메모리가 생감.)
		
		String str1 = new String("java");
		String str2 = new String(" android");
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2); //str1 에 str2 붙은것이 아니라 just str1이 새로운 문자열이 된 것임!!!!!!(더이상 str1은 java 가 아님)
		
		System.out.print(str1);
		

		System.out.println(System.identityHashCode(str1)); //위와 달라짐

	}

}
