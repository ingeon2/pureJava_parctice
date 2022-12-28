package cooperation;

public class Bus {
	
	int busNumber;
	int pessengerCount;
	int money;
	
	public Bus (int busNumber) { //생성자 선언
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //버스의 멤버변수 머니에 매개변수 머니를 더하고 , 승객수 +1 해주는 매서드
		this.money += money;
		pessengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스" +  busNumber + "번의 승객수는 " + pessengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
