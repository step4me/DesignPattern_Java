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
			System.out.println("지금 요리 가능");
		else
			System.out.println("재료가 떨어졌습니다.");
	}

	@Override
	protected void serving(String order) {
		Random random = new Random();
		int result = random.nextInt(2);
		switch (result) {
		case 0: // fail
			System.out.println("요리 중입니다. 기다려 주세요.");
			break;
		case 1: // success
			System.out.println("손님이 주문한 요리 서빙");
			break;
		default:
			break;
		}
		
	}

}
