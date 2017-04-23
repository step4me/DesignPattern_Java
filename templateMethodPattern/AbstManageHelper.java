package templateMethodPattern;

public abstract class AbstManageHelper {

	//Process about managing restaurant
	abstract protected String receiveOrder(String order);
	
	abstract protected void cooking(String order, String possible);
	
	abstract protected void serving(String order);

	//template method
	public void startRestaurant(String order){
		receiveOrder(order);
		
		String cookPossible;
		cookPossible = "yes";
		cooking(order, cookPossible);
		
		serving(order);
		
	}
}
