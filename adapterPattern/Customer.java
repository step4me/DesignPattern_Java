package adapterPattern;

public class Customer {
	private String order;
	
	public Customer(String order){
		this.order = order;
	}
	
	public String getOrder(){
		return this.order;
	}
	
	public void setOrder(String order){
		this.order = order;
	}

}
