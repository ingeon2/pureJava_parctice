package chapter5;

public class StudendtTest1 {

	public static void main(String[] args) { // 인스턴스 여러개 생성하기
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.studentName = "안영미";
		System.out.println(student2.getStudentName());
		

	}

}
