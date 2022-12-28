package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "이순신"); //임포트 필요함 (패키지 달라서)
		Member memberKim = new Member(102, "김유신");
		Member memberPark = new Member(104, "박수호");
		Member memberShin = new Member(103, "신사임당");
		
		memberArrayList.addMember(memberLee); //0
		memberArrayList.addMember(memberKim); //2
		memberArrayList.addMember(memberShin); //3
		memberArrayList.insertMember(memberPark, 1); //1
		
		memberArrayList.showAll();
		
		//지워보자
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAll();
		

	}

}
