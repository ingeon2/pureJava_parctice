package reference;

public class Subject { //과목 클래스 만들기
	
	String SubjectName;
	int scorePoint;
	
	public String getSubjectName() { //겟 셋 매서드들 아래까지
		return SubjectName;
	}
	
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
}
