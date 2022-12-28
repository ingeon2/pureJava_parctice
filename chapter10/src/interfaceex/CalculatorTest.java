package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//Clac clac1 = new Clac(); 인터페이스라서 오류남
		//Clac clac2 = new Calculator(); 추상 클래스라서 오류남
		//Calculator clac3 = new CompleteClac(); 생성은 되지만, 추상 클래스 카큘레이터라서 매서드 add. 이런걸 사용 못함
		
		Clac calc4 = new CompleteClac(); //Clac 클래스라서, 컴플릿 클래스에서 만들어진 매서드 쇼인포는 사용할 수 없다.
										 //calc4.showInfo() 오류나와~
		
		int num1 = 300;
		int num2 = 10;
		
		System.out.println(calc4.add(num1, num2));
		System.out.println(calc4.substract(num1, num2));
		System.out.println(calc4.times(num1, num2));
		System.out.println(calc4.divide(num1, num2));
		
		
		int [] arr = {1, 2, 3, 4, 5}; // 정적 매서드 - 뉴 클래스명 이런식으로 인스턴스 생성 없이 사용가능한 매서드
		System.out.println(Clac.total(arr));
		
		
		
	}

}
