package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
			personLee.name = "이인건";
			personLee.height = 179;
			personLee.weight = 72;
		
		Person personMo = new Person("모비스");
				System.out.println("이름 : " + personMo.name);
		
		Person personKim = new Person ("김두한" , 179 , 72);
			System.out.println("이름 : " + personKim.name +" 키 : " + personKim.height + " 무게 : " + personKim.weight);

	}

}
