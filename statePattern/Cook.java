package statePattern;

public class Cook implements State {

	private static Cook cook = new Cook(); //Cook 클래스의 인스턴스로 초기화
	private Cook() { }
	
	public static Cook getInstance(){
		return cook;
	}
	
	@Override
	public void cook(Chef chef) {
		System.out.println("벌써 요리중입니다.");
	}

	@Override
	public void clean(Chef chef) {
		chef.setState(Clean.getInstance());
		System.out.println("주방을 정돈합니다.");
	}
	
	@Override
	public void rest(Chef chef) {
		chef.setState(Rest.getInstance());
		System.out.println("잠깐 쉽니다.");
	}
}
