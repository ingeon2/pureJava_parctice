package array;

public class BookArray {

	public static void main(String[] args) {
		Book [] library = new Book[5];
		
		
		for(int i = 0 ; i < library.length ; i++) {
		System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥" , "조정래");
		library[1] = new Book("데미안" , "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가" , "유시민");
		library[3] = new Book("토지" , "박경리");
		library[4] = new Book("어린왕자" , "생텍쥐페리");
		
		for(int i = 0 ; i < library.length ; i++) {
			System.out.println(library[i]);
			}
		
		for(int i = 0 ; i < library.length ; i++) {
			library[i].showBookInfo();
			}
		}

}
//처음에 암것도 안넣어줘서 주소값없어서 널 , 그다음에 값 넣어주고 주소값 생겨서 주소값 출력 , 그다음에 북인포 매서드로 북네임 어더 보여줌.