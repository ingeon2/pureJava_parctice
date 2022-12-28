package P123;

public class Q1switch {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		char operator = '1';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
			}
		else if(operator == '-') {
			result = num1 - num2;
			}
		else if(operator == '*') {
			result = num1 * num2;
			}
		else if(operator == '/') {
			result = num1 / num2;
			}
		else {
			System.out.println("그런 연산자는 없네요");
			return; // 리턴 없으면 그런 연산자는 없네요 에다가 맨 아래의 프린트ln까지 나와벌임
		}
		
		System.out.println("num1" + operator + "num2 = " + result + "입니다.");
		
	}
}
