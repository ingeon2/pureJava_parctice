package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerPark = new VIPCustomer(10030, "Park", 1);
		
		
		System.out.println(customerPark.showCustomerInfo());
		System.out.println(customerPark.calPrice(10000) + " , " + customerPark.bonusPoint);
		//칼 프라이스 가격 10000에서 10퍼센트 할인되어 9000, 보너스포인트 프라이스 가격 10000에서 보너스래셔 5퍼센트

	}

}
