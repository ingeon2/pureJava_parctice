package P446;

import java.util.HashMap;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory(); //인스턴스라는 카팩토리자료형 정적변수 생성.
	HashMap<String, Car> carMap = new HashMap<String, Car>(); //카맵이라는 해쉬맵자료형 변수 생성.
	
	private CarFactory () {} //생성자
	
	public Car createCar(String name) {
		if( carMap.containsKey(name) ) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
	
	public static CarFactory getInstance() { //생성자 비슷한데..? instance라는 카팩토리 자료형 번수 비어있으면 새로운 카팩토리 할당해줘라.
		
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

}
