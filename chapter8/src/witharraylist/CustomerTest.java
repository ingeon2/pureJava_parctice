package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("===================고객정보 출력!======================");
		
		for(Customer customer : customerList) { //향상된 포문 for(자료형 이름 : 리스트)
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==============할인율과 보너스포인트 결과!===================");
		
		int price = 10000;
		for(Customer customer : customerList) { 
			
			int cost = customer.calPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
			
	}
		

}
