package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("라운드로빈 겟 넥스트 콜입니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("라운드로빈 센드콜투에이전트입니다");
		
	}

}
