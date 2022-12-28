package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = mul(num1,num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다");
	}
	
	public static int add(int n1 , int n2) {
		int result = n1 + n2;
		return result; // 함수의 결과값을 반환합니다 -> return함수
	}
	
	public static int min(int n1 , int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int n1 , int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int div(int n1 , int n2) {
		int result = n1 * n2;
		return result;
	}

} //함수만들기!!!!!!!!

// add함수 정의 -> 인트 n1 인트 n2를 인트 리절트에 더한 후 리절트를 반환해라
// 함수를 만드는 이유 -> 여기서는 원래있는 더하기 함수를 만들었지만, 다른 상황에선 기본으로 주어지지 않는 사용자 정의 함수가 필요하기 때문.
