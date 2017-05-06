package adapterPattern;

public class Manager {
	private Customer customer;

	public String getOrder(){
		customer = new Customer("One Lemonade");
		return customer.getOrder();
	}
}
