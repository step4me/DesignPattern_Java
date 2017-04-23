package strategyPattern;

public class Cooking implements Management {
	
	@Override
	public void doWork() {
		System.out.println("주문받은 요리를 시작합니다.");
	}
}
