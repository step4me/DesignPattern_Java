package factoryMethodPattern;

import java.util.Date;

public class CakeCreator extends FoodItemCreator {

	@Override
	protected void orderTableInfo(int tableNum) { 
		System.out.println(tableNum + "�� ���̺��� �ɟ� �ֹ��߽��ϴ�.");
	}

	@Override
	protected void createFoodLog() {
		System.out.println("�ɟ� �ֹ� �߰� "+ new Date());
	}

	@Override
	protected FoodItem createFood() {
		return new Cake();
	}

}
