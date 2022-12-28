package lambda;

interface PrintString{
	void showPrinting(String str);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str); //변수 lambdaPrint 에 대입해서 바로 implements하는 방법 1
		lambdaPrint.showPrinting("test");
		
		showMyString(lambdaPrint);  //implements 된것 자체가 매개변수로 넘어가는 방법 2 (22행) 이게 test2
		
		PrintString restr = returnPrint(); //implements 된것 자체를 반환값으로 넘어가는 방법 3
		restr.showPrinting("Hello");
		
		

	}
	
	public static void showMyString(PrintString lambda) { //이게 바로 함수를 변수처럼 사용하는 람다식
		lambda.showPrinting("test2");
	}
	
	public static PrintString returnPrint() {
		PrintString str = s -> System.out.println(s + " World"); //반환 값으로 쓰이는 람다식
		return str;  
	}
	//바로 위의 함수 사용하기 in 17,18행
	
	

}
