package chapter5;

public class Showping {
	long Num;
	String ID;
	String Day; //날짜는 원래 Calendar사용
	String Name;
	String GoodsId;
	String library;
	
	public static void main(String[] args) {
		Showping order1 = new Showping();
		order1.Num = 201803120001L;
		order1.ID = "abc123";
		order1.Day = "2018년 3월 12일";
		order1.Name = "홍길순";
		order1.GoodsId = "PD0345-12";
		order1.library = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order1.Num);
		System.out.println("주문자 아이디 : " + order1.ID);
		System.out.println("주문 날짜 : " + order1.Day);
		System.out.println("주문자 이름 : " + order1.Name);
		System.out.println("주문 상품 번호 : " + order1.GoodsId);
		System.out.println("배송 주소 : " + order1.library);
		
		
		

	}

}
