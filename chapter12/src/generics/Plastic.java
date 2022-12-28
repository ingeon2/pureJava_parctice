package generics;

public class Plastic extends Material{
	public String toString() {
		return "재료 플라스틱임";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력중");
		
	}

}
