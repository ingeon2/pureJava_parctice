package generics;

public class ThreeDPrinterPowder {
	
	private Powder material;

	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
	
	

}
////제너릭 → 클래스 보고 눈치껏 자료형 맞춰줌. 여기서는 파우더냐 플라스틱이냐 자료형을 제너릭이 맞춰주겠지?
//쓰리디프린터플라스틱 + 쓰리디프린터파우더 = 제너릭형 쓰리디프린터