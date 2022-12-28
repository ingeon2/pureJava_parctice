package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass () {
		inClass = new InClass();
	}
	
	
	
	
	private class InClass{ //OutClass 안의 클래스
		int inNum = 200;
		//static int sInNum = 100; (내부 클래스에서 외부 변수 사용할때! 매서드 등 스태틱 금지임) - 내부 정적 클래스와의 차이점
		
		void inTest() {
			System.out.println(num); //내부 클래스도 클래스 안에 있기 때문에, 프라이빗 변수 사용가능
			System.out.println(sNum);
		}
	}
	public void usingInTest() { //인클래스와 연관해서 사용한 매서드
		inClass.inTest();
	}
	
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; (내부 정적 클래스에서 외부 변수 사용할때!는 스태틱 변수,매서드만 사용해야함) - 내부 클래스와의 차이점
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum); //정적변수 아니여도 내부클래스라서 사용가능
			System.out.println(sInNum);
			
		}
		
		static void sTest() { //여기서는 위의 함수와 비교해서, num, iNum 사용불가 (정적 매서드이기 때문)
			System.out.println(sNum);
			System.out.println(sInNum);
		} 
		
	}
	
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		System.out.println("위는 그냥 내부클래스의 그냥 매서드 아래는 정적 내부클래스의 그냥 매서드");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println("아래는 정적 내부클래스의 정적매서드라서 생성없이 식만 덜렁 있는것.");
		
		OutClass.InStaticClass.sTest();
	}

}
