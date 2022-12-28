package staticex;
public class Student {
	
	
	static int serialNum = 10000;
	static int cardNum = serialNum + 100;
	
	int studentID;
	int cardID;
	String studentName;
	
	public Student() { // Student studentJ = new Student(); 이렇게 생성자가 호출될때마다 (시리얼넘++, 스튜던트ID = 시리얼넘) 해라
		serialNum ++;
		studentID = serialNum;
		cardNum ++;
		cardID = cardNum;
	}
	

	public static int getSerialNum() {
		int i = 0; //지역변수
		
		/*studentName = "홍길동";   ---  인스턴스변수 , 인스턴스변수 (에러이유 = 인스턴스도 없는데 이름에 홍길동을 어케넣냐? 
											시리얼 넘은 인스턴스없어도 기본메모리에 저장되어 생길 수 있다) */
		
		return serialNum; //스태틱 변수
	}
	
	
	
} // 프라이빗 변수들 어케사용하는지알지? - 스튜던트테스트2.자바
