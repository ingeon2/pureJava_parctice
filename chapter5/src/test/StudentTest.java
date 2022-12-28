package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.address = "서울";
		
		//studentLee.studentName = "이인건"; 이전 스튜던트 클래스만들때 스튜던트 네임은 private 사용 -> 외부클래스에서 사용불가.
		studentLee.setStudentName("이인건"); // 얘는 매서드생성할떄 piblic으로 해서 이름건들수있음.
		
		
		System.out.println(studentLee.getStudnetName( ));

	}

}
