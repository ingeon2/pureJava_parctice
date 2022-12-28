package interfaceex;

public class CompleteClac extends Calculator{ //상속은 클래스 하나밖에 안되지만, 인터페이스의 임플리먼츠는 여러클래스 가능


	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}
		return ERROR; //카크 인터페이스 실행한 카큐레이터에서 상속받은 컴플릿카큘레이터 라서 에러상수(카크에서 만듦)도 사용가능
	}
	
	public void showInfo() {
		System.out.println("Clac 인터페이스를 구현했어요"); //얘는 인터페이스의 인스턴스에서는 사용할 수 없다! 를 보여주기 위해 작성
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기입니다");
	}
	
	

}
