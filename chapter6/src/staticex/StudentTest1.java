package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //얘를 만들때! 시리얼넘 10001이 되고, 걔를 스튜던트ID에 할당시켜줬어
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); //얘를 만들때! 시리얼넘 10002이 되고, 걔를 스튜던트ID에 할당시켜줬어
												//이후 시리얼넘은 학생 더 안만들었으니 10002 그대로 고정.
		
		/*Student studentL = new Student(); 얘 추가하면 시리얼넘 10003 궁금하면 해봐! */
		
		System.out.println(studentJ.serialNum); //얘네 둘이 10002인 이유는 학생두명생기며 시리얼넘이 10002로 되었고, 스태틱 변수라 두개의 인스턴스가 같은값을 가짐
		System.out.println(studentT.serialNum);
		
		System.out.println(Student.serialNum); //보다시피 클래스에서 스태틱변수(시리얼넘)뽑으면 경고없음
		
		// 스태틱변수 = 클래스변수임 그래서 위의 노란줄이, 왜 스튜던트클래스에서 변수뽑지 하나의 인스턴스에서 뽑았냐? 라는 경고임
		

	}

}
