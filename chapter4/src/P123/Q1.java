package P123;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		char operator = '-';
		
		int result = 0;
		switch(operator) {
		case '+' :
			result = num1 + num2;
			break;
		
		case '-' :
			result = num1 - num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			result = num1 / num2;
			break;
		}
	
		System.out.println("num1" + operator + "num2 의 결과는" + result + "입니다.");

	}

}
