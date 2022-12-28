package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student [] st = new Student[3];
		
		st[0] = new Student (1001 , "James"); 
		st[1] = new Student (1002 , "Tomas"); 
		st[2] = new Student (1003 , "Edward");
		
		for(int i = 0 ; i < st.length ; i++) {
			st[i].showStudentInfo();
		}

	}

}
