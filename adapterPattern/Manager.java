package adapterPattern;

public class Manager {

	public String getOrder(){
		Customer customer = new Customer("One Lemonade");
		return customer.getOrder();
	}
}
