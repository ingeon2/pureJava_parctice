package array;

public class Book {
	String bookName;
	String author;
	
	public Book() {}
	
	public Book(String bookName , String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo () {
		System.out.println(bookName + " , " + author);
	}
	

}  //Book 이라는 객체를 만들었어 Book 이라는 객체를 만들었어 Book 이라는 객체를 만들었어 Book 이라는 객체를 만들었어 Book 이라는 객체를 만들었어
