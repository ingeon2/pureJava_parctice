package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book [] a = new Book[3];
		Book [] b = new Book[3];
		
		a[0] = new Book("태백산맥" , "조정래");
		a[1] = new Book("데미안" , "헤르만 헤세");
		a[2] = new Book("어떻게 살 것인가" , "유시민");
		
		
		
	
		//여기부터
		b[0] = new Book();
		b[1] = new Book();
		b[2] = new Book();
		
		for(int i = 0 ; i < b.length ; i++) {
			b[i].setBookName(a[i].getBookName()); 
			b[i].setAuthor(a[i].getAuthor()); 
		}
		//여기까지가 얕은 복사와의 차이. 얕은복사는System.copy 메서드 사용.
		
		
		
		//b 출력 후 a 바꾸고 나서도 b는 그대로이다
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
		
				
		a[0].setBookName("나목"); //a의 첫번째 정보의 제목과저자 바꾸기
		a[0].setAuthor("박완서");
		
		System.out.println("=== a ===");
		for(int i = 0 ; i < a.length ; i++) {
			a[i].showBookInfo();
		} //a 출력
		
		
		System.out.println("=== b ===");
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		} //b 출력
		
		//얘는 깊은복사라서 주소공유의 복사 느낌이 아니라, 인스턴스를 따로 생성함!
		  
		
		System.out.println("===향상된 for 문 === 이전 for문에서처럼 i의 범위 지정할 필요 없이 전부 다 나옴");
		
		int [] c = new int[] {1, 2, 3};
		for(int d : c) {
			System.out.println(d);
		}
		
		
		for(Book s : a){
		s.showBookInfo();}

	}

}
