package factoryMethodPattern;

import java.util.Date;

public class CakeCreator extends FoodItemCreator {

	@Override
	protected void orderTableInfo(int tableNum) { 
		System.out.println(tableNum + "번 테이블에서 케잌 주문했습니다.");
	}

	@Override
	protected void createFoodLog() {
		System.out.println("케잌 주문 추가 "+ new Date());
	}

	@Override
	protected FoodItem createFood() {
		return new Cake();
	}

}
