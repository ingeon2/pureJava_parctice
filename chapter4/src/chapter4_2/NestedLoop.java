package chapter4_2;

public class NestedLoop {

	public static void main(String[] args) {
		int i , j;
		for(i=1 ; i<=9 ; i++) {
			System.out.println(i + "단 입니다");
			
			for(j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j); //ex) i=1에서 반복, i=2에서 반복...
			}
			
		}
		
		System.out.println("구구단을 마쳤습니다.");

	}

}
//중첩된 for문 (구구단)