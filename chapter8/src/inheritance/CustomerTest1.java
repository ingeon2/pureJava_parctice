package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		//지금 얘는 커스터머랑 VIP커스터머에서 디폴트 생성자 주석처리해서 에러난것. 커스터머 테스트2에서는 커스터머에 해당하는 생성자로 생성해서 에러 X
	}

}
