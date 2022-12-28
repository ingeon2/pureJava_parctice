package cooperation;

public class Subway {
	
	int lineNumber;
	int pessengerCount;
	int money;
	
	public Subway (int lineNumber) { //생성자 선언
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //섭웨이의 멤버변수 머니에 매개변수 머니를 더하고 , 승객수 +1 해주는 매서드
		this.money += money;
		pessengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철" +  lineNumber + "호선의 승객수는 " + pessengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}


}
