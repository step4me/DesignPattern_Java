package adapterPattern;

public class Main {
	
	public static void main(String[] args){
	
		ManagerAdapter customerOrder = new AdaManagerImpl();
		System.out.println(customerOrder.getBeverage());
		System.out.println(customerOrder.getMeal());
		System.out.println(customerOrder.getSalad());
	}

}
