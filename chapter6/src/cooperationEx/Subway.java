package cooperationEx;

public class Subway {
	
	int subNum;
	int pessengerCount;
	int money;
	
	public Subway(int subNum) {
		this.subNum = subNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void subinfo() {
		System.out.println(subNum + "호선 지하철은 " + pessengerCount + "명을 태웠고, 수입은 " + money + "원 입니다");
	}

}
