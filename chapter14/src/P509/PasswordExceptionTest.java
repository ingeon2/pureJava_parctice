package P509;

public class PasswordExceptionTest {
	
	String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException{
		
		if(password == null) {
			throw new PasswordException("널값 꺼져");
		}
		else if(password.length() < 5) {
			throw new PasswordException("길이 5보다 짧으면 꺼져");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("문자열로만 이루어졌으면 꺼져");
		}
		this.password = password;
	}



	public static void main(String[] args) {
		
		PasswordExceptionTest test = new PasswordExceptionTest();
			
		String password = null;
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e);
		}
		
		password = "abcdef";
			try {
				test.setPassword(password);
			} catch (PasswordException e) {
				System.out.println(e);
			}
			
		password = "1234";
			try {
				test.setPassword(password);
			} catch (PasswordException e) {
				System.out.println(e);
			}
		
		

	}

}
