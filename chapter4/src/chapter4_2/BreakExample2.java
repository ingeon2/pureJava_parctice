package chapter4_2;

public class BreakExample2 {

	public static void main(String[] args) {
		//책 120페이지 121페이지보고 브레이크문 이해하기
		int Num;
		int Sum = 0;
		for(Num = 1 ; Sum < 100 ; Num++) { // Sum이 100보다 커지면 종료 
			Sum += Num;
			//if(Sum >= 100)break; 에다가 포 문에서 Sum < 100 지우기 그러면 결과가 넘14 섬105 된다.
		}
		System.out.println("Num : " + Num);
		System.out.println("Sum : " + Sum);

	}

}
