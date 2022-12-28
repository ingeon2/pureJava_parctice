package chapter2;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; //8비트 2진수 숫자 5 표현
		
		System.out.println(num << 2); // 10100 
		System.out.println(num >> 2); // 1 (2진수)
		System.out.println(num >>> 2); // 1(2진수)
		
		System.out.println(num);
		
		
		num = num << 2; //10100 으로 num변수 자체를 바꿔버림
		System.out.println(num);
	}

}
