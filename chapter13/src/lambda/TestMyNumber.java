package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y)? x : y;
		
		System.out.println(max.getMax(10, 20));

	}

}//람다 식 형태 (변수, 변수) -> {할거}
 //				    변수 -> {할거}
