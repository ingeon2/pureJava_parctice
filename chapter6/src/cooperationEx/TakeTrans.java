package cooperationEx;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student ¼öÈ£ = new Student("¼öÈ£" , 100000);
		Student ÈñÀ± = new Student("ÈñÀ±" , 5000);
		
		Bus bus1 = new Bus(3);
		Subway subway1 = new Subway(1);
		Taxi taxi1 = new Taxi(6680);
		
		¼öÈ£.takeBus(bus1);
		¼öÈ£.takeTaxi(taxi1);
		ÈñÀ±.takeSub(subway1);
		
		bus1.businfo();
		subway1.subinfo();
		taxi1.taxiinfo();
		
		¼öÈ£.showInfo();
		ÈñÀ±.showInfo();

	}

}
