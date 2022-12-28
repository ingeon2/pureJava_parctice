package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 지알아서 방향을 조절합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("지알아서 멈춥니다.");		
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼함수 AI카 재정의입니다");
	}
	
	
	
	

}
