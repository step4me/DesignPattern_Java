package statePattern;

public class Rest implements State {
	private static Rest rest = new Rest(); //Clean 클래스의 인스턴스로 초기화
	private Rest() { }
	
	public static Rest getInstance(){
		return rest;
	}

	@Override
	public void cook(Chef chef) {
		chef.setState(Cook.getInstance());
		System.out.println("요리를 시작합니다.");
	}

	@Override
	public void clean(Chef chef) {
		chef.setState(Clean.getInstance());
		System.out.println("주방을 정돈합니다.");
	}

	@Override
	public void rest(Chef chef) {
		System.out.println("아까부터 쉬고 있습니다.");	
	}

}
