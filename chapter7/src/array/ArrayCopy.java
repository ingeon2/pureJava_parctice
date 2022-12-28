package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int [] a = new int[] {1, 2, 3, 4, 5};
		int [] b = new int[] {10, 20, 30, 40, 50};
		
		System.arraycopy(a, 0, b, 1, 4);
		
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i]);
		}

	}

} //어레이카피 ( 어디배열 어디 , 어디배열 어디에 , 몇개를 )
//				 1				3		  2
