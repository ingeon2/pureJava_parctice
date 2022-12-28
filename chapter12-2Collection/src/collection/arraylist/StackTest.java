package collection.arraylist;

import java.util.ArrayList;

class MyStack{ //스택은 LIFO 스택은 LIFO
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { //스택 푸쉬
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("정보가 없는데 어떻게삭제해요 ㅡㅡ");
			return null;
		}
		return arrayStack.remove(len - 1); //여기가 큐 와의 차이
	}
	
	public String peek() { //pop 매서드와의 차이 리무브 , 겟 (픽 함수는 맨위에있는걸 겟 매서드로 꺼내보는 매서드.)
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("정보가 없는데 어떻게삭제해요 ㅡㅡ");
			return null;
		}
		return arrayStack.get(len - 1);
	}
	
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println("위는 픽이고 아래는 팝");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		

	}

}
