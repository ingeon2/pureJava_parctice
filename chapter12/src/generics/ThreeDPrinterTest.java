package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<Powder>(); //제너릭에서, 쓰리디프린터 클래스를 파우더 자료형으로 사용할게! 라는 뜻
		
		printer1.setMaterial(new Powder()); //프린터가 파우더 자료형이니 파우더 셋 매서드 사용가능하지. (Plastic넣으면 틀렸다고함)
		
		Powder powder = printer1.getMaterial();
		
		System.out.println(printer1); //자동으로 .투스트링 이라고 컴파일해줌
		
		printer1.printing();
		
		
		
		
		
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>(); //제너릭에서, 쓰리디프린터 클래스를 플라스틱 자료형으로 사용할게! 라는 뜻
		
		printer2.setMaterial(new Plastic()); //프린터가 플라스틱 자료형이니 파우더 셋 매서드 사용가능하지. (Powder넣으면 틀렸다고함)
		
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2); ////자동으로 .투스트링 이라고 컴파일해줌
		
		printer2.printing();
			
		
		
		//ThreeDPrinter<Water> printer3 = new ThreeDPrinter<Water>(); 얘는 오류나옴, 왜일까 생각!

	}

}
//플라스틱, 파우더 클래스가 쓰리디프린터 인스턴스 printer1,printer2의 자료형으로.