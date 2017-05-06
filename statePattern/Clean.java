package statePattern;

public class Clean implements State{

	private static Clean clean = new Clean(); //Clean Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	private Clean() { }
	
	public static Clean getInstance(){
		return clean;
	}
	
	@Override
	public void cook(Chef chef) {
		chef.setState(Cook.getInstance());
		System.out.println("�丮�� �����մϴ�.");
	}

	@Override
	public void clean(Chef chef) {
		System.out.println("���� û�����Դϴ�.");
	}

	@Override
	public void rest(Chef chef) {
		chef.setState(Rest.getInstance());
		System.out.println("��� ���ϴ�.");
	}


}
