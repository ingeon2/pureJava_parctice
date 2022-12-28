package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안정환";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
//이전의 스튜던트 에서 학생 클래스를 만들었고, 같은 패키지에 있는 스튜던트 테스트도 학생 클래스를 사용할 수 있어 사용한 것이다.
//스튜던트의 스튜던트안, 스튜던트테스트의 스튜던트안 서로 다르다. (지역변수!)
//클래스는 스튜던트, 인스턴스는 스튜던트안