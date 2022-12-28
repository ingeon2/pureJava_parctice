package thisex;

class Person{
	String name;
	int age;

//여기서의 this는 또다른 생성자를 호출하는 this이다!!!!!!!!!!
	
	Person(){ 
		this("이름 없음" , 1);  // 얘가 아래의 14행부터 17행까지의 생성자를 호출함
	}						 // 생성자가 (스트링 이름업음 , 인트 1) 로 생성해서 데이터타입이 맞는 아래 생성자(13행)로 알아서 맵핑되어서 생성된다!
	
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	
	public	Person	returnSelf() { //this를 이용하여 주소 값 반환하는 매서드 (자료형 잘보기)
		return this;
	}
}
	



public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person("이인건" , 26);
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		System.out.println(p1.returnSelf()); // 디스로 주소값 반환하는 매서드 만들어서 한것
		System.out.println(p1); // 그냥 주소값 출력
	}

}
