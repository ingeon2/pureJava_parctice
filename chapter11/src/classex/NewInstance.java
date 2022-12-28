package classex;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class pClass = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass.newInstance();

	}

}//Class 변수로 다른 클래스에서도 Person의 인스턴스를 만드는 방법. 하지만 곧 사라지기에 저런 줄이 그어졌어. (디폴트 생성자임.)
