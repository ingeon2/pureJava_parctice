package P288alone;

public abstract class Car {
	
	public void run() {
		System.out.println("어차피 오버라이딩 할겁니다.");
	}
	
	public void refuel() {
		System.out.println("어차피 오버라이딩 할겁니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	public abstract void takePassenger(); 
	
	public abstract void load(); 

}
