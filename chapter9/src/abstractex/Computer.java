package abstractex;

public abstract class Computer { // 추상 클래스 구현 (추상 매서드의 존재때문에 추상 클래스가 되는것.)
	
	public void tornOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void tornOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public abstract void display(); //이게 추상 매서드 
	//(상속해서 매서드 사용하는것과 다른게 뭐에요! → 추상 매서드는 상위클래스에서 공통으로 정의된것 없음! 형태가 함수명(); 이게 끝이잖아)
	 
	public abstract void typing();
	

}
// 컴퓨터에서 데스크톱(디스플레이, 타이핑) 노트북 상속(디스플레이), 노트북에서 마이노트북(타이핑) 상속. 추상매서드를 전부 구현해야 더이상의 추상클래스가 아님! 이해하기.
