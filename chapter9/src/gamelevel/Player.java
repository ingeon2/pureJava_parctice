package gamelevel;

public class Player {
	
	private PlayerLevel level; //Player 가 가지는 level변수 선언 (int=9; 와 같은것)
	
	public Player() { // 디폴트생성자 + 레벨처음 비기너부터시작 + 쇼레벨메세지 매서드 사용
		level = new BegeinnerLevel(); //비기너 레벨이 플레이어 레벨을 상속받았으니 가능
		level.showLevelMessege();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { //플레이어 레벨 클래스의 변수를 매개변수로 받는 매서드
		this.level = level;						  //디스 레벨 (내 레벨)을 매개변수로 받은 레벨로 변경.
		level.showLevelMessege();
	}
	
	public void play(int count) { //PlayerLevel 클래스의 go매서드를 호출
		level.go(count);
	}

}
