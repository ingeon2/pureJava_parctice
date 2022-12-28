package arraylist74;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.studentInfo();
		
		
		System.out.println("======================================");
		
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("영어", 70);
		studentKim.addSubject("수학", 60);
		
		studentKim.studentInfo();
		
	}

}
