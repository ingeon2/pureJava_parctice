package collection.arraylist;

import java.util.ArrayList;

class MyQueue{ //큐는 FIFO 큐는 FIFO 큐는 FIFO
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String pop() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("정보가 없는데 어떻게삭제해요 ㅡㅡ");
			return null;
		}
		return arrayQueue.remove(0); //여기가 스택과의 차이
	}
	
}

public class QueueTest {
	

	public static void main(String[] args) {
		

	}

}
