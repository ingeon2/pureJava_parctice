package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf; //멤버변수 (책장이니 책 제목들 입력해야지.)
	
	public Shelf() { //생성자
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() { //shelf는 어레이리스트형 변수이므로 사이즈 매서드 사용가능.
		return shelf.size();
	}
	
	
	
}
