package cooperationEx;

public class Student {
	
	String studentName;
	int grade;
	int money;
	int num;
	
	public Student(String studentName , int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
		num++;
	}
	
	public void takeSub(Subway subway) {
		subway.take(2000);
		money -= 2000;
		num++;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money -= 10000;
		num++;
	}
	
	public void showInfo() {
		System.out.println(studentName + "¿∫ ±≥≈Î¿ª " + num + "»∏∏¶ ≈¿∞Ì, ¿‹µ∑¿∫ " + money + "ø¯ ¿‘¥œ¥Ÿ");
	}
}
