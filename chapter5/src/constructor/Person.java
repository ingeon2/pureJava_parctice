package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname , float pheight , float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

//p156 그림설명 꼭읽기 위의 8행 디폴트 생성자와   10행 직접만든 생성자의 차이점!