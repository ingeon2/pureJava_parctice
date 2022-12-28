package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a =65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; -66은 코드에 저장되어 있지 않아서 char형태로 사용 불가 (음수는 맨앞 비트에서 결정)
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);

	}

}
