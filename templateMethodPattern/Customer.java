package templateMethodPattern;

public class Customer {

	private CustomerStatus customerStatus;
	
	public Customer(){
		customerStatus = CustomerStatus.NONE;
	}
	
	public CustomerStatus getCustomerStatus(){
		return customerStatus;
	}
	
	public void setCustomerStatus(CustomerStatus customerStatus){
		this.customerStatus = customerStatus;
	}
}
