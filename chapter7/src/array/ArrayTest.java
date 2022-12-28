package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] numbers1 = new int[3];
		numbers1[0] = 1;
		numbers1[1] = 2;
		numbers1[2] = 3;
		
		for(int i = 0 ; i < numbers1.length ; i++) {
			System.out.println(numbers1[i]);
		}	
		
		
		int [] numbers2 = new int[] {4, 5, 6};
		
		/* 위의 선언하는법 두가지와,
		 	int [] numbers3 = new int[3] {7, 8, 9}; =====이건 오류 크기 비워놓아야함 */
		
		
		
		int [] studentID = new int[5]; //선언만하고 값 안넣어주면 int의 초기값 0들로 채워짐! (double 은 0.0, string 은 null)
		for(int i = 0 ; i < studentID.length ; i++) {
		System.out.println(studentID[i]);
		}
		
		

	}

}
