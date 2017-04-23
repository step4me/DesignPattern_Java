package adapterPattern;

public class AdaManagerImpl extends Manager implements ManagerAdapter{
	
	@Override
	public String getBeverage() {
		return getOrder();
	}
	
	@Override
	public String getMeal() {
		return changeOrder("One Bulgogi with rice").getOrder();
	}

	

	@Override
	public String getSalad() {
		
		return changeOrder("One Salad").getOrder();
	}
	
	public Customer changeOrder(String order){
		return new Customer(order);
	}

}
