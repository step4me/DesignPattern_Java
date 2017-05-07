package factoryMethodPattern;

public class Main {
	
	public static void main(String[] args){
		FoodItemCreator creator;
		FoodItem food; 
		
		creator = new CookieCreator();
		food = creator.create();
		food.make();

		creator = new CakeCreator();
		food = creator.create();
		food.make();
	}

}
