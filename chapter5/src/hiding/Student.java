package hiding;

public class Student {
	int studentID;
	public String studentName;
	int grade;
	public String address;
	
	public String getStudnetName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}                                                      //겟 셋 함수 우클릭에서 얻을 수 있다.
}
