package P346Ex;

public class BubbleSort implements Sort{
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("버블소트 어센딩입니다.");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("버블소트 디센딩입니다.");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("버블소트입니다");
	}

}
