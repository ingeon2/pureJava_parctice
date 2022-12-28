package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //겟 러너블이라는 매서드, 러너블(라이브러리엑 기본 인터페이스 존재)이라는 형태로 반환하면 된다
		int num = 100;
		
		
		class MyRunnable implements Runnable { //겟 러너블 매서드 안에서 / 마이러너블 이라는 러너블 인터페이스와 연관된 클래스를 만듦. (임플리먼츠했으니까 오버라이딩갈겨)
			int localNum = 300;

		@Override
		public void run() {
			System.out.println(outNum);
			System.out.println(sNum);
			System.out.println(localNum);
			System.out.println(num);
			System.out.println(i);
			
			//num = 200; 얘네 둘은 색이 다르잖아. 지역변수라서. 그러니까 상수처럼 사용해서 값을 변경할 수는 없어. but위처럼 프린트라인으로 사용할 수 는 있어.
			//i = 100;
			
			}
			
		}
		return new MyRunnable(); //마이러너블이 러너블 인터페이스에서 온 클래스니까, 러너블로 반환하라는 겟러너블 매서드의 반환은 마이러너블로 올 수 있음.
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Runnable runner = outer.getRunnable(10);
		runner.run();
		
		outer.getRunnable(10).run(); //멤버변수 안에 매서드 안에 메서드 바로 위의 두줄을 한줄로 축약한것.
		

	}

}
//p458,459보기 (익명 내부 클래스)