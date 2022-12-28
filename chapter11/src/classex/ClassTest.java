package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); //옵젝트 메서드(겟클래스)
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); //Class 매서드
		System.out.println(pClass3.getName());

	}//Class클래스로 다른 클래스 가져오는 세가지 방법. forName 중요!!! forName 중요!!! forName 중요!!!

}
