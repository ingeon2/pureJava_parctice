package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book [] a = new Book[3];
		Book [] b = new Book[3];
		
		a[0] = new Book("태백산맥" , "조정래");
		a[1] = new Book("데미안" , "헤르만 헤세");
		a[2] = new Book("어떻게 살 것인가" , "유시민");
		
		System.arraycopy(a, 0, b, 0, 3);
		
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
		
		
		a[0].setBookName("나목"); //a의 첫번째 정보의 제목과저자 바꾸기
		a[0].setAuthor("박완서");
		
		System.out.println("=== a ===");
		for(int i = 0 ; i < a.length ; i++) {
			a[i].showBookInfo();
		}
		
		
		System.out.println("=== b ===");
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
	}

}
//왜 복사하고 변경하고 출력해도 변경한것이 반영될까? → 내용복사가 아니라, 주소를 복사했기 때문. (얕은복사 얕은복사 얕은복사 얕은복사 얕은복사 얕은복사 얕은복사 얕은복사)