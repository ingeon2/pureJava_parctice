package collection;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	//위는 겟셋
	public String toString() {
		return memberName + "님의 회원번호는 " + memberId + "입니다.";
	}
	
	//여기부터는 해쉬코드때문에, 멤버 클래스에서 같은 객체를 처리하는 방법 구현. (set은 중복되지 않아야 하잖아)

	@Override
	public int hashCode() {
		return memberId; //같은 멤버아이디면 같은 해쉬코드(주소, 식별자)
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) { //obj 멤버인스턴스라면
			Member member = (Member)obj; //member변수에 obj다운캐스팅해서 넣고
			
			if(this.memberId == member.memberId) //member변수의 아이디가 나의 아이디가 같으면 이퀄 매서드가 트루이다
				return true; //이퀄 매서드가 트루이다
			else //아니면
				return false; //이퀄 매서드가 폴스이다
		}
		return false; //obj가 Member의 인스턴스 아니라면 그냥 볼것도없이 폴스 때려라  라고 오버라이딩함
	}

	
	
	
}
