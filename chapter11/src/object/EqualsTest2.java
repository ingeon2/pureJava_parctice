package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID , String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Student) {   //스튜던트 인스턴스 아니면 그냥 비교도 못하니까, (인스턴스 오브 스튜던트가 맞다!)
			Student std = (Student)obj;   //옵젝트 obj를 스튜던트 std로 다운캐스팅하고
			if(studentID == std.studentID) 
				return true;  //아이디가 같다면 트루갈겨
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
		
	}
	
	
		
}


public class EqualsTest2 {

	public static void main(String[] args) {
		
		Student std1 = new Student(100, "박수호");
		Student std2 = new Student(100, "박수호");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //재정의 전엔 폴스다! 재정의 하고 나서 트루!
		
		System.out.println("=========해시코드========");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode()); //위에서 이퀄매서드 재정의해줬으니(논리값 같으니), 같은곳에 집어넣으라고 해쉬코드 매서드도 재정의해야함 (자바 기본)	
											 //위에서 이퀄매서드 재정의해줬으니(논리값 같으니), 같은곳에 집어넣으라고 해쉬코드 매서드도 재정의해야함 (자바 기본)	
											 //위에서 이퀄매서드 재정의해줬으니(논리값 같으니), 같은곳에 집어넣으라고 해쉬코드 매서드도 재정의해야함 (자바 기본)	
											 //위에서 이퀄매서드 재정의해줬으니(논리값 같으니), 같은곳에 집어넣으라고 해쉬코드 매서드도 재정의해야함 (자바 기본)	
											 //위에서 이퀄매서드 재정의해줬으니(논리값 같으니), 같은곳에 집어넣으라고 해쉬코드 매서드도 재정의해야함 (자바 기본)	
		

	}

}
