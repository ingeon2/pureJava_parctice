package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "Java");
		
		//위는 기존(객체지향), 아래는 람다식(함수지향)
		
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + " " + s2); //람다식(=함수만든다고생각) 인터페이스명-함수명 = 변수 -> 만들함수   	순서
		concat2.makeString("Hello", "Java"); //위에서는 StringConcatImpl 클래스 나왔잖아. 여기서는 (익명클래스)가 있는것과 마찬가지라 바로 인터페이스 갈기는것.
																							//위의 설명 P468 
	}

}
