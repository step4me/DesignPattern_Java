package templateMethodPattern;

public abstract class AbstManager {
	private Customer customer;
	private Ingredient ingredient;
	private CustomerStatus customerStatus;
	private IngredientStatus ingredientStatus;
	
	public AbstManager(Customer customer, Ingredient ingredient){
		this.customer = customer;
		this.ingredient = ingredient;
		customerStatus = CustomerStatus.NONE;
		ingredientStatus = ingredientStatus.ENOUGH;
	}
	
	public void cooking(){
		CustomerStatus custStatus = customer.getCustomerStatus();
		if(custStatus == CustomerStatus.COMING)
			System.out.println("손님이 밀려 들어오고 있습니다. 빨리 요리해 주세요.");
		else
			System.out.println("이 손님의 요리만 하면 됩니다. 여유를 갖고 마무리 하셔도 됩니다.");
		
		IngredientStatus ingredStatus = ingredient.getIngredStatus();
		if(ingredStatus == IngredientStatus.ENOUGH)
			System.out.println("요리에 쓰일 재료가 충분합니다. 잠시만 기다려주세요.");
		else
			System.out.println("재료가 다 떨어졌습니다. 마켓을 이용해 주세요.");
		
		finishOrder();
	}
	
	abstract protected void finishOrder();
	
}
