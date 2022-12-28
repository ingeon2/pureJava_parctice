package witharraylist;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer(int CustomerID , String customerName) {
		super (CustomerID , customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	
	

	@Override
	public int calPrice(int price) {
		bonusPoint +=  price * bonusRatio;
		return price - (int)(price * saleRatio);
	}



	public static void main(String[] args) {

	}

}
