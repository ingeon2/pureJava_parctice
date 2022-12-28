package object;

class Book{
	int bookNum;
	String bookTitle;
	
	Book(int bookNum , String bookTitle) { //생성자
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		
		
	}

	@Override
	public String toString() {
		return bookNum + " , " + bookTitle;
	}
}





public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(1200, "두잇자바");
		
		System.out.println(book1); //인스턴스 book1 정보를 나타내는 매서드지만(object.Book@7a81197d), 위에서와 같이 재정의함.
		//System.out.print(book1.toString()); 원래 이 형태이지만, 컴파일할때 자바에서 붙여줌.
		

	}

}
