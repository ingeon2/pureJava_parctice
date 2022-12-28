package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	int Num;
	
	public Student(String studentName , int money ) { //네임 머니 받는 생성자 (디폴트생성자 아님)
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus( Bus bus ) { //버스타는 매서드
		bus.take(1000); //버스 자바에서 만든 매서드 take ★이부분이 객체의 협업★ (매서드 안의 매서드!)
		money -= 1000;
		Num++;
	}
	
	public void takeSubway( Subway subway /*왼쪽은 생성된 인스턴스가 들어갈 곳*/ ) { //섭웨이타는 매서드
		subway.take(1500); //섭웨이 자바에서 만든 매서드 take ★이부분이 객체의 협업★ (매서드 안의 매서드!)
		money -= 1500;
		Num++;
	}
		
	public void showInfo() { //정보 알려주는 매서드
		System.out.println(studentName + "님은 대중교통을 " + Num + "회 이용하셨고, 남은 금액은" + money + "원 입니다");
	}
}
