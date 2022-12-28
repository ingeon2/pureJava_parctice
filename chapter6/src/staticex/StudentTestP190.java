package staticex;

public class StudentTestP190 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		System.out.println(studentLee.studentID);
		System.out.println(studentLee.cardID);
		
		Student studentKim = new Student();
		System.out.println(studentKim.cardID);
		
		System.out.println(Student.cardNum);

	}

}
