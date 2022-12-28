package chapter4_2;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {sum += num;
			num++;          
			
		}while(num <= 10);
		System.out.println("1에서10합은" + sum);

	}

}

//와일과 두 와일 차이점 - 조건문이 각각 앞,뒤 이므로 조건 폴스여도 두 와일문은 무조건 한번은 실행.
// 위의 예에서, num <= 0 하면 와일은 섬이 0 but 두 와일은 섬이 1