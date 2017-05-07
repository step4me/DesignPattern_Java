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
			System.out.println("�մ��� �з� ������ �ֽ��ϴ�. ���� �丮�� �ּ���.");
		else
			System.out.println("�� �մ��� �丮�� �ϸ� �˴ϴ�. ������ ���� ������ �ϼŵ� �˴ϴ�.");
		
		IngredientStatus ingredStatus = ingredient.getIngredStatus();
		if(ingredStatus == IngredientStatus.ENOUGH)
			System.out.println("�丮�� ���� ��ᰡ ����մϴ�. ��ø� ��ٷ��ּ���.");
		else
			System.out.println("��ᰡ �� ���������ϴ�. ������ �̿��� �ּ���.");
		
		finishOrder();
	}
	
	abstract protected void finishOrder();
	
}
