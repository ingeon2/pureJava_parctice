package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010 , "Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020 , "Kim" , 12);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		
		//이씨는 그냥 커스터머 → 가격 그대로 지불
		//김씨는 그냥 VIP커스터머 → 가격 세일포인트(VIP커스터머 멤버변수)만큼 할인되어 지불 (매서드 재정의)
		
		
		
		System.out.println(customerLee.getCustomerName() + "님이 지불해야하실 금액은 " + customerLee.calPrice(price) + "원 입니다.");
		System.out.println(customerLee.showCustomerInfo());
		//위의 함수와 아래의 함수는 달라! (둘 다 재정의함) + 보너스포인트 결과가 왜 저렇게될까 생각~(함수 순서도 중요함.)
		System.out.println(customerKim.getCustomerName() + "님이 지불해야하실 금액은 " + customerKim.calPrice(price) + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		System.out.println("===============변환한놈 + 오버라이딩 매서드======================얘 이름은 가상 매서드!====");
		
		Customer vc = new VIPCustomer (10030 , "vc" , 123){};
		System.out.println("변환한놈인데 만원이면 그냥메서드 구천원이면 오버라이딩 매서드, 결과는? " +vc.calPrice(price));

	}

}
