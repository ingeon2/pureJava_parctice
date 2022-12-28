package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getinstance(); //이거 형태 기억하기. private 생성자와 static 매서드 가져다가 쓰려면 필요한 줄.
											// c1에 컴퍼니 클래스의 겟 인스턴스 함수써서 할당해줘라.
		
		Company c2 = Company.getinstance();
		
		System.out.println(c1); //instance 반환 메서드를 프린트라인해라 = instance 프린트아웃 하라는 뜻 = instance 주소(싱글톤이라 같음)
		System.out.println(c2);
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal1);
		System.out.println(cal2); //얘네들은 기본으로 싱글톤타입.(프라이빗 스태틱으로 지정안해줘도)

	}

}
//싱글톤 = 인스턴스를! 유일하게. 클래스 아래에 인스턴스 만들때, 프라이빗 스태틱!