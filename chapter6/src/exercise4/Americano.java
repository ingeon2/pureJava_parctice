package exercise4;

public class Americano {
	String coffeeName;
	int money;
	int cups;
	
	public Americano (String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public void take(int money) {
		this.money += money;
		cups ++;
	}
	
	public void ameInfo() {
		System.out.println(coffeeName + "를 " + cups + "잔을 판매하셨습니다. 아메리카노 총 판매액은" + money + "원 입니다.");
	}


}
