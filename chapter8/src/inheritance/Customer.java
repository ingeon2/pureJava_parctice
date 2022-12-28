package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*public Customer() {  //생성자
		//super (); = 컴파일러가 자동추가하는 코드. 디폴트 생성자처럼 적지 않아도 있는것임 상위 클래스(Object)를 호출하는 예약어.
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출"); //실행하면 커스터머랑 vip커스터머 누가먼저인지 순서 알 수 있다.
	}*/
	
	public Customer(int customerID , String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	
	
	
	
	
	
	public int calPrice (int price) { //보너스포인트 계산 매서드
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() { //고객정보 알려주는 매서드
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
		bonusPoint + "입니다." ;
	}
	
	
	
	//프로텍티드 멤버변수들 매서드로 사용하게 겟셋추가
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
