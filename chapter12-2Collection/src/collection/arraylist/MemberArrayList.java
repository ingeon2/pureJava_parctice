package collection.arraylist;

import java.util.ArrayList; //컨트롤 쉬프트 오!
import java.util.Iterator;

import collection.Member; //멤버 클래스가 같은 패키지에 없어서 가져온것. (자료형으로 써야하잖아)

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList () {
		arrayList = new ArrayList<Member>(); //어레이리스트 생성자
	}
	
	
	//아래 전부 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//alone
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	
	
	/*public boolean removeMember(int memberId) { //매서드 이해해봐 ㅋㅋ... + 불린으로 뽑아내는 매서드 폴스 + 포 문 → 폴스의 위치 생각 (for문 끝나고 보통 리턴 포스)
		
		for(int i = 0 ; i < arrayList.size() ; i++) {
			Member member = arrayList.get(i);
			int id = member.getMemberId();
					if(id == memberId) {
						arrayList.remove(i);
						return true;
					}
		}
		System.out.println("너가 적은 멤버아이디 숫자는 없는디..?");
		return false;
	}*/
	
	//위와 똑같은 매서드지만 이터래터로 푸는매서드 바로 아래에
	
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = arrayList.iterator();
		while ( iterator.hasNext()) {
			Member member = iterator.next();
		
			int id = member.getMemberId();
			if(memberId == id) {
				arrayList.remove(member);
				return true;
		}
	}
		System.out.println("너가 적은 멤버아이디 숫자는 없는디..?");
		return false;
			
}
	
	
	
	
	
	public void showAll() {
		
		for(Member member : arrayList) {
			System.out.println(member.toString());
		}
		System.out.println(); //한줄씩 공백 생기게 하려구!
		//System.out.println(arrayList); 얘는 어떻게 출력될까? [이순신님의 회원번호는 101입니다., 김유신님의 회원번호는 102입니다., 신사임당님의 회원번호는 103입니다.]
	}
	
}
