package singleton;

public class Company {
	
	private static Company instance = new Company(); //이렇게 선언하면 싱글톤. 이제 컴퍼니 클래스에서 다른 인스턴스 못만들어
	
	private Company () {} // 프라이빗 디폴트 생성자

	public static Company getinstance() { //스태틱 메서드라 인스턴스 생성없이 사용가능
		if (instance == null)
			instance = new Company();
		return instance;
	}
		
}
