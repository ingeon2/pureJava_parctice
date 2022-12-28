package generics;

public class ThreeDPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
			return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	

}
// 3d프린터 플라스틱,파우더 클래스를 3d프린터 클래스 하나로 통합하기 위해 오브젝트 자료형 사용한다고 치면,
// → 그러면 겟 셋 매서드 에선, 겟 매서드는 오브젝트 자료형으로 출력되어야하고, 셋 매서드는 오브젝트 자료형으로 매개변수가 들어가야함.
// → 그러면 그때그때마다 책 P389처럼 형변환을 해줘야해 (모르겠으면 책 갈기기)
// → 이러한 상황때문에 우리가 제너릭(위의 T)을 사용한다!
// → 이렇게 제너릭 해놓고, 나중에 원하는 자료형을 '클래스명<Powder>' 이런식으로 정의한다. (쓰리디프린터테스트에 있음)

// 근데 재료는 플라스틱 파우더만 가능하고 물은 가능하지 않는데.. → 플라스틱 파우더의 상위클래스 Material을 만들었고, extends를 <T>안에 적어줬음. = <T> 타입에 대한 제한
// → Water은 Material을 상위클래스로 두지 못헀으니, ThreeDPrinter 클래스의 자료형으로 쓰일 수 없음 