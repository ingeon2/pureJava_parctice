package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer(); //추상클래스는 인스턴스 생성 못해 (public abstract Computer 이라서)
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook(); //위와 같은 이유
		Computer c4 = new MyNoteBook();

	}

}
