package lambda;

public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) { //인터페이스에서 설정한것 추상매서드 구현.
		System.out.println(s1 + " " + s2);
		}
	

}
//람다식이 아닌 우리가 원래 하던 방식으로 매서드 만드는것. (매서드 만들기만 했고, 사용하고싶으면 테스트스트링콘캣 가야지)