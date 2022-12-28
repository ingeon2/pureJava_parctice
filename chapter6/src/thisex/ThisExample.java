package thisex; 


//this 의미 알기 위한 코딩
//얘는 클래스 퍼블릭이랑 그냥으로 두개만듦
//여기서의 this 는 자신의 메모리를 가리키는 this 이다. 프린트디스 함수도 메모리 주소를 나타내고 있잖아!!


class BirthDay{
	int day;
	int month;
	int year;


	public void setYear(int year) { //연도 지정 매서드
	this.year = year; //this.year는 버스데이 클래스의 이어 , 뒤의 year는 setYear 옆의 int year 
	}
	
	public void printThis() { // this 출력 매서드
		System.out.println(this);
	}
}



public class ThisExample {

	public static void main(String[] args) {
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		b1.setYear(2000);
		System.out.println(b1);
		System.out.println(b2);
		b1.printThis(); //여기의 this와
		b2.printThis(); //여기의 this 는 다르다 (다른 인스턴스이기 때문에 힙 메모리의 다른 부분에서 저장되기 때문.)

	}

}
