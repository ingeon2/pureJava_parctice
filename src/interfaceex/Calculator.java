package interfaceex;

public abstract class Calculator implements Clac{ // 인터페이스에서의 추상매서드 4개중 2개 구현한 후 또 하위클래스에 상속시켜 나머지 두개 구현하겠다.
												  // 2개만 구현했다 → 두개는 추상매서드 인 채로 가짐 → 추상 클래스여야함(문법적 설명을 위해 일부러 두개만 구현.)

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	

}
