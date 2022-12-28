package template;

public class ManualCar extends Car{
	
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 직접 핸들을 조절합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");		
	}
	
	@Override
	public void wiper() {
		System.out.println("와이퍼함수 Manual카 재정의입니다");
	}

}
