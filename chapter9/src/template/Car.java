package template;

public abstract class Car {
	
	public abstract void drive(); //추상매서드
	public abstract void stop(); //추상매서드
	
	public void wiper () {} //하위클래스에서 재정의할 매서드 (추상매서드X)
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	

}
