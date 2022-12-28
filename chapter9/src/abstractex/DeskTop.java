package abstractex;

public class DeskTop extends Computer { //추상 클래스 상속받으면, 추상 매서드들 정의해야함 (여기서는 디스플레이와 타이핑)

	@Override
	public void display() {
		System.out.println("Desktop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
		
	}

}
