package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신"); //임포트 필요함 (패키지 달라서)
		Member memberKim = new Member(102, "김유신");
		Member memberLee2 = new Member(101, "이몽룡");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		memberHashSet.showAll();
		
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll(); //멤버아이디 같은것은 중복된 자료. (멤버에서 오버라이딩 두개 한거)

	}

}
