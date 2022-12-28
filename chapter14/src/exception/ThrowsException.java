package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException{
		//위의 throws는 트라이캐치 이따 사용한다(미뤘다) 라는 뜻
		
		FileInputStream fis = new FileInputStream(filename);
		Class c = Class.forName(className);
		return c;
	}
	
	
	

	public static void main(String[] args) {
		
	ThrowsException ex = new ThrowsException(); //아까 throws 한거 여기서 핸들링(트라이캐치) 해야함 , 그래서 해줬음
	try {
		ex.loadClass("b.txt", "java.lang.String"); //b.txt만들었고 자바랭스트링있어서 캣치수행안된다
	} catch (FileNotFoundException e) {
		System.out.println(e);
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	} /*어떤 익셉션 클래스로 핸들링 해야할지 모르겠다면, 최상위클래스 갈겨버리기 , 아래에 써야함 (위에쓰면 전부 얘가 먹어버려서 나머지 익셉션으로 도달 x)
	  catch (Exception e) {
		System.out.println(e);
	}
	
	*/
	
	System.out.println("중간에 죽은건 아니고!");

  }

}
