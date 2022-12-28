package chapter4_2;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i=1, sum=0 ; i<=10 ; ++i) {
			sum += i;
		}
		System.out.println("1~10합은" + sum + "이다능.");

	}

}


//for 문은 (초기값 ; 언제까지 ; 증,감)