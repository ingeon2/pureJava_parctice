package chapter4;

public class P100HW {

	public static void main(String[] args) {
		int score = 55;
		char grade;
			if (score >= 90){
				grade = 'A';
				System.out.println("훌륭합니다.");
			}
			else if (score >= 80){
				grade = 'B';
				System.out.println("양호합니다.");
			}
			else if (score >= 70){
				grade = 'C';
				System.out.println("애매합니다.");
			}
			else if (score >= 60){
				grade = 'D';
				System.out.println("아쉽습니다.");
			}
			else{
				grade = 'F';
				System.out.println("형편없습니다.");
			}
			
			System.out.println("성적이 " + grade + "입니다.");


	}

}
