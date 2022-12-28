package chapter4_2;

public class ContinueExample {

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c = 5;
		for(a=1 ; a<=100 ; a++) {
			if(a%c == 0) continue;
			b += a;
		}
		System.out.println("1부터 100까지 " + c + "의 배수를 제외하고 합하면" + b + "나와용");

	}

}
