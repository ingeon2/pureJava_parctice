package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer(); //�߻�Ŭ������ �ν��Ͻ� ���� ���� (public abstract Computer �̶�)
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook(); //���� ���� ����
		Computer c4 = new MyNoteBook();

	}

}