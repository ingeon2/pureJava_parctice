package scheduler;

public class LeastJob implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("리스트잡 겟 넥스트 콜입니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("리스트잡 센드콜투에이전트입니다");
		
	}

}
