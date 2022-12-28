package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
			
			private HashSet<Member> hashSet;
			
			public MemberHashSet () {
				hashSet = new HashSet<Member>(); //해쉬셋 생성자
			}
			
			
			//아래 전부 메서드
			public void addMember(Member member) {
				hashSet.add(member);
			}
			
			
			public boolean removeMember(int memberId) {
				Iterator<Member> iterator = hashSet.iterator();
				
				while ( iterator.hasNext()) {
					Member member = iterator.next();
				
					int id = member.getMemberId();
					if(memberId == id) {
						hashSet.remove(member);
						return true;
				}
			}
				System.out.println("너가 적은 멤버아이디 숫자는 없는디..?");
				return false;
					
		}
			
			
			
			
			
			public void showAll() {
				
				for(Member member : hashSet) {
					System.out.println(member.toString());
				}
				System.out.println(); //한줄씩 공백 생기게 하려구!
				//System.out.println(arrayList); 얘는 어떻게 출력될까? [이순신님의 회원번호는 101입니다., 김유신님의 회원번호는 102입니다., 신사임당님의 회원번호는 103입니다.]
			}

}
