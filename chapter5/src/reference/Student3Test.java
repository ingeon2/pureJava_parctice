package reference;

public class Student3Test {

	public static void main(String[] args) {
		Student3 studentJames = new Student3(100, "James");
																						/*public Student3(int id , String name) { //생성자 다른방향으로 생성
																						studentID = id;
																						studentName = name;
																						
																						korean = new Subject();
																						math = new Subject();
																					}    */
		
		studentJames.setKorean("국어", 100);
		studentJames.setMath("수학", 90);
		
		
																					/*public void setKorean(String name , int score) { //세팅 매서드
																							korean.setSubjectName(name);
																							korean.setScorePoint(score);
																						}
								
																					public void setMath(String name , int score) { //세팅 매서드
																						math.setSubjectName(name);
																						math.setScorePoint(score);
																					}    */
		
		studentJames.showStudentInfo();
		
																						/* public void showStudentInfo() {
																						int total = korean.getScorePoint() + math.getScorePoint();
																						System.out.println("학생의 총점은 " + total + "점 입니다.");
																					} */
	}

}
