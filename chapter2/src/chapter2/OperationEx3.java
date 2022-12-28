package chapter2;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); 
		//&&연산자때문에 앞에서 flase라서 뒤에것은안함 (이미 false확정이기 때문)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);
		//||연산자때문에 앞에서 true라서 뒤에것은 안함 (이미 true확정이기 때문)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
