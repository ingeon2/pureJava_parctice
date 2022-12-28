package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		set.add("aaa");
		System.out.println(set); //set이라서 둘이 똑같이나옴 (중복인정x)
		

	}

}
