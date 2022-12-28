package arraylist74;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; //이게 중요
	
	
	public Student (int studentID , String studentName ) { //아이디 네임 가져오고, 서브젝트리스트 생성하라는 생성자.
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); //이게 중요 (Subject클래스의 변수 모임이 ArrayList)
	}
	
	public void addSubject(String name , int score) {//서브젝트 생성하고, 생성된 서브젝트를 학생의 서브젝트 리스트(어레이리스트, 인스턴스의 변수)에 추가시키는 매서드
									
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void studentInfo( ) {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + "님의" + subject.getName() + "과목의 성적은" +
								subject.getScorePoint() + "점 입니다");	
		}
		
		System.out.println("학생 " + studentName + "님의 총점은" + total + "점 입니다");	
		
	}
	
	
	
}
