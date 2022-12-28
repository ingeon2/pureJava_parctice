package witharraylist;

public class VIPCustomer extends Customer{
	
	private int agentID; //VIP고객 상담원 ID
	double saleRatio; //할인율
	
	public VIPCustomer() { 
		//super(); 생략된것과 마찬가지!
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	} // 디폴트 생성자
	
	public VIPCustomer(int CustomerID , String customerName , int agentID) {
		super (CustomerID, customerName); 
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	} // 내가 만든 생성자
	
	
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
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다."; 
	} //쇼 커스터머 인포 재정의는 VIP만 필요함 (상담원 번호 멤버변수 VIP만 갖고있기 때문.)

	
	
	
	
	
	

}
