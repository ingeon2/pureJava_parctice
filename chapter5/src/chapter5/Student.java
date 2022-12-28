package chapter5;

public class Student {  //학생 클래스 만들기 (기본 함수도 만들지 않았음 퍼블릭보이드 어쩌고~)
	int studentID; 
	String studentName;
	int grade;
	String address;
	
		public String getStudentName() { //학생 이름을 가져오는 메서드
		return studentName;
	} 
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // student클래스 생성
		studentAhn.studentName = "안문숙";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
