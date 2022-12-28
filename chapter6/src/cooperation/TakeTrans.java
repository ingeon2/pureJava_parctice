package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student ("James" , 5000); //스튜던트 인스턴스 만들기
		Student tomas = new Student ("Tomas" , 10000);
		
		Bus bus1 = new Bus(3); //버스,섭웨이 인스턴스 만들기
		Subway subway1 = new Subway(1);
		
		james.takeBus(bus1); //한번씩 태우는 매서드 (테이크버스 매서드 안에 또 테이크 매서드 있음)
		tomas.takeSubway(subway1);
		
		james.showInfo();//스튜던트 출력 매서드
		tomas.showInfo();
		
		bus1.showInfo(); //버스 섭웨이 출력 매서드
		subway1.showInfo();
		
		

	}

}
