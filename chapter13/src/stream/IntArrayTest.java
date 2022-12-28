package stream;

import java.util.Arrays;


public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		int count = (int)Arrays.stream(a).count();
		System.out.println(count);
		

	}

}
// Arrays.stream(a)