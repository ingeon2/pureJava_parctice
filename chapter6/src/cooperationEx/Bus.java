package cooperationEx;

public class Bus {
	
	int busNum;
	int pessengerCount;
	int money;
	
	public Bus( int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void businfo() {
		System.out.println(busNum + "번 버스는 " + pessengerCount + "명을 태웠고, 수입은 " + money + "원 입니다");
	}

}
