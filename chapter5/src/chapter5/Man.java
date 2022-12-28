package chapter5;

public class Man {
	int Age;
	String Name;
	boolean Married;
	int Baby;

	public static void main(String[] args) {
		Man man1 = new Man();
		man1.Name = "James"; //man1은 인스턴스라서 스택메모리 , 네임은 힙(heap) 메모리
		man1.Age = 40;
		man1.Married = true;
		man1.Baby = 3;
		
		System.out.println("나이 : " + man1.Age);
		System.out.println("이름 : " + man1.Name);
		System.out.println("결혼 여부 : " + man1.Married);
		System.out.println("아가 명수 : " + man1.Baby);

	}

}
