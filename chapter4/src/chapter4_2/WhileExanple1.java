package chapter4_2;

public class WhileExanple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 10){ //(넘 <= 10) 참이면 계속해라 -> 폴스면 멈춰 -> 11에서 멈춤
			sum += num; //섬 = 섬 + 넘
			num++; //넘 1씩 증가
		}
		
		System.out.println("1부터 10까지의 합은" + sum + "이다");

	}

}
