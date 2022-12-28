package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; //게임스코어 1 더한 후 라스트스코어1에 대입 -> 결국은 라스트스코어 게임스코어 둘다 151
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore; 
		System.out.println(lastScore2);
		
		
		//게임스코어 뒤에 ++,--붙을 상황 생각해보기

	}

}
