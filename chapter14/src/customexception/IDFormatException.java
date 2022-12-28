package customexception;

public class IDFormatException extends Exception{
	
	public IDFormatException(String message) { //상위클래스에서 메세지 내놓는 매서드(super) 사용할거라는 생성자
		super(message);
	}
	

}
