package P123;

public class Q4 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1 ; i<=9 ; i++) {
			System.out.println("========="+ i +"단입니다========");
			for(j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				if(i<=j) break;
			}
		}
	
		System.out.println("구구단을 마쳤습니다.");

	}

}
