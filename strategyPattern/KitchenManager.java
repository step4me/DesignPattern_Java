package strategyPattern;

public class KitchenManager {
	
	//interface
	private Management manage;
	
	public void work() {
		if (manage == null){
			System.out.println("�Ĵ� ���� �غ� ������ �ʾҽ��ϴ�.");
		} else { //delegate
			manage.doWork();
		}
	}
	
	//��ȯ ����
	public void setManagement(Management manage){
		this.manage = manage;
	}

}
