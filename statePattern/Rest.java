package statePattern;

public class Rest implements State {
	private static Rest rest = new Rest(); //Clean Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	private Rest() { }
	
	public static Rest getInstance(){
		return rest;
	}

	@Override
	public void cook(Chef chef) {
		chef.setState(Cook.getInstance());
		System.out.println("�丮�� �����մϴ�.");
	}

	@Override
	public void clean(Chef chef) {
		chef.setState(Clean.getInstance());
		System.out.println("�ֹ��� �����մϴ�.");
	}

	@Override
	public void rest(Chef chef) {
		System.out.println("�Ʊ���� ���� �ֽ��ϴ�.");	
	}

}
