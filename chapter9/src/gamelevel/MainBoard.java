package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); //첫 생성한 비기너 레벨(디폴트생성자에서 첫 레벨 비기너로 설정해서)
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
