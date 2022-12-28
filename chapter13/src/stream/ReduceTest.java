package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { //제일짧은 String
		
		if(s1.getBytes().length <= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}




public class ReduceTest {

	public static void main(String[] args) {
		
		String [] greetings = {"안녕하세요~~~~~", "hello", "Good morning", "반갑습니다"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->{ //greetings가 ArrayList였다면 greetings.stream().forEach 이런식으로 갔겠지
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;}	
		)); //11행부터 14행까지는 만들어서쓴것.
		
		
		//하지만 여기 아래는 위의 CompareString 클래스 인터페이스 연결시키고 매서드 재정의해서 만든것으로 만드는것.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
		

	}

}
