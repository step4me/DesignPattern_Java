package templateMethodPattern;

import java.util.Random;

public class DefaultManageHelper extends AbstManageHelper {

	@Override
	protected String receiveOrder(String order) {
		return order;
	}

	@Override
	protected void cooking(String order, String possible) {

		if (possible.equals("yes"))
			System.out.println("���� �丮 ����");
		else
			System.out.println("��ᰡ ���������ϴ�.");
	}

	@Override
	protected void serving(String order) {
		Random random = new Random();
		int result = random.nextInt(2);
		switch (result) {
		case 0: // fail
			System.out.println("�丮 ���Դϴ�. ��ٷ� �ּ���.");
			break;
		case 1: // success
			System.out.println("�մ��� �ֹ��� �丮 ����");
			break;
		default:
			break;
		}
		
	}

}
