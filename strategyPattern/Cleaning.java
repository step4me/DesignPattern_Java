package strategyPattern;

public class Cleaning implements Management {

	@Override
	public void doWork() {
		System.out.println("테이블을 정리합니다");
	}

}
