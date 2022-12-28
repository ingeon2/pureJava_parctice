package P123;

public class Q3 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1 ; i<=9 ; i++) {
			if(i%2 != 0) continue;
			System.out.println("========="+ i +"단입니다========");
			for(j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				
			}
		}
	
		System.out.println("짝수 단만 있는구구단을 마쳤습니다.");

	}

}
