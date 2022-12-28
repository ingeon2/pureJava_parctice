package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String a : list) { //향상된 for
			System.out.println(a);
		}
		
		for(int i = 0 ; i < list.size() ; i++) { //그냥 for
			System.out.println(list.get(i)); //list[i]는 오류나옴 (ArrayList는 달라)
		}

	}

}
//ArrayList 클래스 이용하기 (남들이 만들어놓은 함수 사용한다고 생각하면 편함.)