package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5 ;i++ ) { //5에서 에러나지 0 1 2 3 4 채워지고
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		
		System.out.println("프로그램 종료");

	}

}
