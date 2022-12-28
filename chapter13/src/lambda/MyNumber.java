package lambda;


@FunctionalInterface //람다식 인터페이스에 추상매서드 하나만 가능하다는 애너테이션 (여러개일 시, 함수명을 적지 않고 사용하는 람다식에서 어떤 추상매서드를 지칭하는지 모르니까)
public interface MyNumber {
	
	int getMax(int num1 , int num2); //추상 매서드 선언

}
