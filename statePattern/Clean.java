package statePattern;

public class Clean implements State{

	private static Clean clean = new Clean(); //Clean 클래스의 인스턴스로 초기화
	private Clean() { }
	
	public static Clean getInstance(){
		return clean;
	}
	
	@Override
	public void cook(Chef chef) {
		chef.setState(Cook.getInstance());
		System.out.println("요리를 시작합니다.");
	}

	@Override
	public void clean(Chef chef) {
		System.out.println("벌써 청소중입니다.");
	}

	@Override
	public void rest(Chef chef) {
		chef.setState(Rest.getInstance());
		System.out.println("잠깐 쉽니다.");
	}


}
