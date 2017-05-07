package templateMethodPattern;

public class Main {
	
	public static void main(String[] args){
		Customer customer = new Customer();
		Ingredient ingredient = new Ingredient();
		AbstManager defaultManager = new DefaultManager(customer, ingredient);
		customer.setCustomerStatus(CustomerStatus.COMING);
		defaultManager.cooking();
		customer.setCustomerStatus(CustomerStatus.NONE);
		defaultManager.cooking();
		ingredient.setIngredStatus(IngredientStatus.NONE);
		customer.setCustomerStatus(CustomerStatus.COMING);
		defaultManager.cooking();
		System.out.println("=============================================");
		AbstManager superManager = new SuperManager(customer, ingredient);
		ingredient.setIngredStatus(IngredientStatus.ENOUGH);
		superManager.cooking();
		customer.setCustomerStatus(CustomerStatus.NONE);
		superManager.cooking();
		ingredient.setIngredStatus(IngredientStatus.NONE);
		customer.setCustomerStatus(CustomerStatus.COMING);
		superManager.cooking();
	}

}
