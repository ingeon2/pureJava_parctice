package exercise4;

public class TakeCoffee {

	public static void main(String[] args) {
		Cafe star = new Cafe("º°´Ù¹æ" , "±è¾¾" , 0);
		
		Americano ame = new Americano("¾Æ¸Þ¸®Ä«³ë");

		star.takeAme(ame); //¾ê°¡ °´Ã¼³¢¸®ÀÇ Çù¾÷
		
		ame.ameInfo();
		
		star.cafeInfo();
	}

}
