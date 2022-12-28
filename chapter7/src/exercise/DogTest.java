package exercise;

public class DogTest {

	public static void main(String[] args) {
		
		Dog [] dogArray = new Dog[5];  // != Dog a = new Dog("¹ÙµÏ1" , "¶Ë°³1");
		
		dogArray[0] = new Dog("¹ÙµÏ1" , "¶Ë°³1");
		dogArray[1] = new Dog("¹ÙµÏ2" , "¶Ë°³2");
		dogArray[2] = new Dog("¹ÙµÏ3" , "¶Ë°³3");
		dogArray[3] = new Dog("¹ÙµÏ4" , "¶Ë°³4");
		dogArray[4] = new Dog("¹ÙµÏ5" , "¶Ë°³5");
		
		for(int i = 0 ; i < dogArray.length ; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		// À§´Â ±×³É for ¾Æ·¡´Â °­È­for
		
		for(Dog d : dogArray) {
			System.out.println(d.showDogInfo());
		}

		
		
		Dog c = new Dog("¹è¿­¾Æ´Ô1" , "¹è¿­¾Æ´Ô2"); //»ý¼ºÀÚ(DogÅ¬·¡½º¿¡ Á¸Àç)¿¡ ¸Â´Â ÀÎ½ºÅÏ½º »ý¼º.
		System.out.println(c.showDogInfo()); //¹è¿­¿¡ ³Ö´Â¹ý°ú ±×³É ÇÏ³ªÀÇ º¯¼ö¿¡ ³Ö´Â¹ý Çò°¥¸±±îºÁ.
		
		
	}

}
