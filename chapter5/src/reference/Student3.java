package reference;

public class Student3 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;				/* 바뀐것 = 이전에 스튜던트2에선 코리아스코어 코리아섭젝 두가지로 생성했던 변수를
	 							섭젝이라는 클래스를 만들어서 두가지를 하나로 만듦.	
	 							위의 두가지(스코어 , 섭젝)는 섭젝 클래스에서 정보입력가능*/
	
	/*public Student3() {
		korean = new Subject();
		math = new Subject();
	} */
	
	public Student3(int id , String name) { //생성자 다른방향으로 생성
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	
	public void setKorean(String name , int score) { //세팅 매서드
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void setMath(String name , int score) { //세팅 매서드
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//지금까지 한 생성, 세팅으로 사용할 매서드 만들기
	
	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생의 총점은 " + total + "점 입니다.");
	}

}
