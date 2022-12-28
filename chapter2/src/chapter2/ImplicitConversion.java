package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //변수 형태 바꾸기
		
		System.out.println(bNum);  //byte
		System.out.println(iNum);  //int
		
		int iNum2 = 20;
		float fNum = iNum2; //변수 형태 바꾸기
		
		System.out.println(iNum);  //int
		System.out.println(fNum);  //float
		
		double  dNum;
		dNum = fNum + iNum; //int 와 float -> float으로 바뀜
		System.out.println(dNum); //double
		
		

	}

}
