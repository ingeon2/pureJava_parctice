package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast()); //연결 리스트의 맨 뒤 요소 삭제 후 해당 요소(C) 출력
		System.out.println(myList);

	}

}
