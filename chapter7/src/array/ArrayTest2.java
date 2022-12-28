package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[3] = 30.0;
		
		for(int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);
		}

	}

}
//길이 5인 배열에서 값 넣지않은곳은 기본형 0.0으로 출력.