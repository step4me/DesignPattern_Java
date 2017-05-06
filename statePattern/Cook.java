package statePattern;

public class Cook implements State {

	private static Cook cook = new Cook(); //Cook Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	private Cook() { }
	
	public static Cook getInstance(){
		return cook;
	}
	
	@Override
	public void cook(Chef chef) {
		System.out.println("���� �丮���Դϴ�.");
	}

	@Override
	public void clean(Chef chef) {
		chef.setState(Clean.getInstance());
		System.out.println("�ֹ��� �����մϴ�.");
	}
	
	@Override
	public void rest(Chef chef) {
		chef.setState(Rest.getInstance());
		System.out.println("��� ���ϴ�.");
	}
}
