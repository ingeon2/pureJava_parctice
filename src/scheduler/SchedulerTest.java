package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// R, L, P
		
		System.out.println("전화 상담 방식을 골라보세요 빨랑!!~!!");
		int ch = System.in.read();
		
		Scheduler scheduler = null; //scheduler 인스턴스 뭐가 될건지 매서드로 만들거라서 일단 널로 할당.
		
		if(ch == 'R'||ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L'||ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P'||ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("선택지에 있는걸 쳐 고르세요 좋은말할때");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
