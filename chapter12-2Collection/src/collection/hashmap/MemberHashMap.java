package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer,Member> hashmap;
	
	public MemberHashMap(){
		hashmap = new HashMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
		hashmap.remove(memberId);
		return true;
		}
		System.out.println(memberId + " 업는디요");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashmap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashmap.get(key);
			System.out.println(member); //멤버 클래스의 toString이미 오버라이딩 했잖아.
			
		}
	}

}
