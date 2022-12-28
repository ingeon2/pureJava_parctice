package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID; //VIP고객 상담원 ID
	double saleRatio; //할인율
	
	/*public VIPCustomer() { //Customer이랑 비교해서 세일비율 추가된 생성자.
		//super (); = 컴파일러가 자동추가하는 코드. 디폴트 생성자처럼 적지 않아도 있는것임 상위 클래스(Customer)를 호출하는 예약어.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출"); //실행하면 커스터머랑 vip커스터머 누가먼저인지 순서 알 수 있다.
	} */
	
	public VIPCustomer(int CustomerID , String customerName , int agentID) {
		super (CustomerID, customerName); //커스터머의 생성자 호출! (ID Name 이전 생성자 호출해서 그대로 쓸거고, 나머지는 내알아서 작성할게.)
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
	//얘는 커스터머 상속받고있으니, 거기있는 멤버변수, 생성자, 매서드 다 사용가능
	
	
	//여기 아래부터 매서드 오버라이딩 (커스터머 클래스의 칼 프라이스 매서드를 VIP커스터머에 맞게 바꾸는 일.)
	@Override        //(@Override 는 컴파일러에게 오버라이드 알려주는 역할)
	public int calPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); //VIP할인 추가해줘야지!
	}


	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다."; 
	}


	
	
	
	
	
	

}
