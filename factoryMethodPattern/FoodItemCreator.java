package factoryMethodPattern;

public abstract class FoodItemCreator {
	
	// factory method ( similar with template method )
	public FoodItem create(){
		FoodItem food;
		int tableNum = 1;
		//step1 
		orderTableInfo(tableNum);
		//step2
		food = createFood();
		//step3
		createFoodLog();
		return food;
	}

	abstract protected void orderTableInfo(int tableNum);
	
	abstract protected void createFoodLog();
	
	abstract protected FoodItem createFood();
}
