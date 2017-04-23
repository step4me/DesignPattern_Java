package strategyPattern;

public class Main {
	
	public static void main(String[] agrs){
		KitchenManager kitchenManager = new KitchenManager();
		kitchenManager.work();
		
		kitchenManager.setManagement(new Cooking());
		kitchenManager.work();
		kitchenManager.setManagement(new Serving());
		kitchenManager.work();
		kitchenManager.setManagement(new Cleaning());
		kitchenManager.work();
	}

}
