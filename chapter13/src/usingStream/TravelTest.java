package usingStream;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		
		 //15세 이상 100만원
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길덩", 13, 50);
		
		ArrayList<TravelCustomer> customerList = new ArrayList();
		
		customerList.add(new TravelCustomer("이순신", 40, 100)); //이렇게도 추가가능
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 이름만!! 출력할게용 =="); //이름만 → map
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		
		System.out.println("== 세명의 가격의 합 ==");
		int sum = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(sum);
		
		
		System.out.println("== 틀딲모임(20세이상 명단) ==");
		customerList.stream().filter(c-> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		

	}

}
