package P484;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


public class LibraryTest {

	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList(); //List는 ArrayList의 상위클래스라서 가능!
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//여기서부터 스트림생성,출력 (Q7)
		
		System.out.println("모든 책의 가격의 합");
		int sum = bookList.stream().mapToInt(c -> c.getPrice()).sum();	
		System.out.println(sum);
		
		System.out.println("책의 가격이 20000이상인 책의 이름 정렬하여 출력");
		bookList.stream().filter(p -> p.getPrice() >= 20000).map(n -> n.getName()).sorted().forEach(n -> System.out.println(n));
		
		

	}

}
