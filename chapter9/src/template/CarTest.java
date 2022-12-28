package template;

public class CarTest {

	public static void main(String[] args) {
		
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("================================");
		
		Car yourcar = new ManualCar();
		yourcar.run();

	}

}
