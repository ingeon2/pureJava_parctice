package generics;

public class Powder extends Material{
	public String toString() {
		return "재료 파우더임";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력중");
		
	}

}
