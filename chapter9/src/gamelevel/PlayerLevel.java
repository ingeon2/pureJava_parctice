package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessege();
	
	public final void go (int count) { //템플릿 매서드 (파이널)
		run();
		for(int i = 0 ; i < count ; i++) { //점프 여러번 시키려고 for문 안에 넣은것.
			jump();
		}
		turn();
	}

}
