package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList <Student> st = new ArrayList<Student>();
		
		st.add(new Student(1001 , "James"));
		st.add(new Student(1002 , "Tomas"));
		st.add(new Student(1003 , "Edward"));
		
		for(int i = 0 ; i < st.size() ; i++) {
			Student student = st.get(i);
			student.showStudentInfo();
		}

	}

}
