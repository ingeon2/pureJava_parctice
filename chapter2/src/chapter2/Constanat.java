package chapter2;

public class Constanat {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
		//MAX_NUM = 10000;   final 이라는 상수형에 저장되어 있으므로 주석 지워도 바뀌지 않음
	}

}
