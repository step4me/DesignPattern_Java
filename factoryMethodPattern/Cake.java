package factoryMethodPattern;

public class Cake implements FoodItem{

	@Override
	public void make() { 
		System.out.println("케익 만들기 시작!");
	}

}
