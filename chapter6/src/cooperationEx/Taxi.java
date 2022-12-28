package cooperationEx;

public class Taxi {
	int taxiNum;
	int pessengerCount;
	int money;
	
	public Taxi( int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void taxiinfo() {
		System.out.println(taxiNum + "번 택시는 " + pessengerCount + "명을 태웠고, 수입은 " + money + "원 입니다");
	}

}
