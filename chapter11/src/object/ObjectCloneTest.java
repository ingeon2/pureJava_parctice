package object;

class Point{
	int x;
	int y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString () {
		return "x =" + x + " , y =" + y;
	}
}

class Circle implements Cloneable{ //이게 배울 클론 매서드이게 배울 클론 매서드이게 배울 클론 매서드이게 배울 클론 매서드
	
	Point point; //위의 포인트 클래스 받아다가 참조.
	private int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x,y);
		this.radius = radius;
	}
	public String toString() {
		return "원점은 " + point + "이고, 반지름의 길이는 " + radius + "입니다.";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException { //이게 배울 클론 매서드 이게 배울 클론 매서드 이게 배울 클론 매서드
 		
		return super.clone();
	}
	
	
	
	
}



public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle clonecircle = (Circle)circle.clone(); //(Circle은 클론매서드 위에보면 옵젝트변수이기때문에 써클변수로 바꿔준것.)
		
		System.out.println(circle.hashCode());
		System.out.println(clonecircle.hashCode());
		
		System.out.println(circle.toString());
		System.out.println(clonecircle.toString());

	}

}
