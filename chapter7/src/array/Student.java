package array;

public class Student {
	int studentID;
	String name;
	
	public Student () {}
	public Student (int studentID , String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	//밑으로 매서드 (왜 겟 셋 매서드 안만들어도 되는걸까? 영상에서는 만들던데.....)
	
	
	
	
	public void showStudentInfo() {
		System.out.println(studentID + " , " + name);
	}
	

}
