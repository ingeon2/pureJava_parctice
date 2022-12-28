package scheduler;

public class PriorityAllocation implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("알로케이션 겟 넥스트 콜입니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("알로케이션 센드콜투에이전트입니다");
		
	}

}
