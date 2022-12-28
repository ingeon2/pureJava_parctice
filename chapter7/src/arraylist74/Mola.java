package arraylist74;

public class Mola {

	public static void main(String[] args) {
		int[]a = new int[5];
		int total = 0;
		
		
		for(int i = 1 ; i < 6 ; i++) {
				a[i-1] = 2*i;
				total += a[i-1];
				}
		
			System.out.print(total);
		
	}

}
