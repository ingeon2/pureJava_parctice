package gamelevel;

public class BegeinnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모르지롱!");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄도 모르지롱 메롱!");
		
	}

	@Override
	public void showLevelMessege() {
		System.out.println("***** 초보자 레벨입니다. *****");
		
	}
	
	

}
