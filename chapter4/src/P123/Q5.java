package P123;

public class Q5 {

	public static void main(String[] args) {
		 int linecount = 4;
		 int spacecount = linecount/2 + 1;
		 int starcount = 1;
		 //int j;
		 for(int i = 0 ; i < linecount ; i++) {  // 여기 for문 안의 j는 각각 다르다 바로 위 각주처럼 적으면 세개 다 같은 j가 된다.
			 for(int j = 0 ; j < spacecount ; j++) { // left 빈공간
				 System.out.print(' ');
			 }
			 for(int j = 0 ; j < starcount ; j++) { // *
				 System.out.print('*');
			 }
			 for(int j = 0 ; j < spacecount ; j++) { // right 빈공간
				 System.out.print(' ');
			 }
			 spacecount -= 1;
			 starcount += 2;
			 System.out.println();
			 
		 }

	}

}
