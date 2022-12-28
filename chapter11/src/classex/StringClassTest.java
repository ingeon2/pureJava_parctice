package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String"); //직접만든x 원래있는 스트링 클래스 가져와서 strClass인스턴스 생성
		
		Constructor[] cons = strClass.getConstructors(); //만든 srtClass의 컨스트럭터 부르는 매서드로 Constructor[]클래스의 cons인스턴스 생성
		
		for(Constructor c : cons) { //생성자 어케만드는지 보여줌
			System.out.println(c);
			}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f); //public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER(모든 멤버변수가옴)
		}
		
		Method[] methods = strClass.getMethods();
		
		for(Method m : methods) {
			System.out.println(m);//모든 메서드들 가져옴 IN "java.lang.String"
		}

	}

}//String 클래스 정보를 Class 클래스로 알아본것.
