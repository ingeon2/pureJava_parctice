package classex;

public class Person {
	
	int age;
	String name;
	
	public Person() {}
	
	public Person(int age) {
		this.age = age;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	} //여기까지 생성자 3개 이다음 겟셋

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
