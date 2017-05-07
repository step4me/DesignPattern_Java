package factoryMethodPattern;

import java.util.Date;

public class CookieCreator extends FoodItemCreator {

	@Override
	protected void orderTableInfo(int tableNum) {
		System.out.println(tableNum + "�� ���̺��� ��Ű �ֹ��߽��ϴ�.");
	}

	@Override
	protected void createFoodLog() { 
		System.out.println("��Ű �ֹ� �߰� "+ new Date());
	}

	@Override
	protected FoodItem createFood() {
		return new Cookie();
	}

	

}
