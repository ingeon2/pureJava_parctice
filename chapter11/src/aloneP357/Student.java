package aloneP357;

public class Student {
	int studentID;
	String studentName;
	
	Student(int studentID , String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
			
	}
		
	
	@Override
	public String toString() {
		return studentID + " , " + studentName;
	}



	public static void main(String[] args) {
		
		Student studentLee = new Student(10, "¿Ã¿Œ∞«");
		
		System.out.println(studentLee);
	}
	
	
	

}

