package bookshelf;

//이게 핵심. Queue 와 Shelf 를 상속받고 implement해서 만들 클래스

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String Title) { // 책 제목 배열의 맨 뒤로 추가하는 매서드
		 shelf.add(Title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // shelf 어레이리스트에서 0번째것을 출력하면서 제거.
		
	}

	@Override
	public int getSize() { //어레이리스트의 크기 → 책의 수
		return getCount();
	}
	
	

}
