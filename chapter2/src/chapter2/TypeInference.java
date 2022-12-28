package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10; //  int
		var j = 10.0; // double
		var z = "hello"; // str
		
		System.out.println(i);
		System.out.println(j);
		
		
		
		System.out.println(z);

		z = "test"; //프린트ln이 위라서 프린트되는것은 헬로고 그 이후로 테스트로 변수 할당.
		
	}

}
