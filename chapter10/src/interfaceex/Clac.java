package interfaceex;

public interface Clac {  //인터페이스에선 상수와 추상매서드만 가능하다.
	
	double PI = 3.14;  //인터페이스에선 자동으로 상수로 저장됨 (퍼블릭 스태틱 파이널 더블 파이 = 3.14;) 이탤릭체.
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//여기부터는 자바8부터 추가된 내용 (디폴트 매서드, 정적 매서드, 프라이빗 매서드)
	
	// 프라이빗 매서드 - just 인터페이스 내부에서만 사용하는 매서드
	
	default void description() { // 디폴트 - 기본 구현 가짐(위의 원래 인터페이스의 매서드들 보면 구현 없잖아), 이후 재정의 가능
		System.out.println("정수 계산기를 구현합니다"); //컴플릿 카큘레이터에서 재정의함
	}
	
	
	static int total(int[] arr) { // 정적 매서드 - 뉴 클래스명 이런식으로 인스턴스 생성 없이 사용가능한 매서드
		int total = 0;			  // 카큘레이터 테스트에서 인스턴스생성없이 매서드갈김
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
	

}

//인터페이스는 "뼈대" 이다.