package templateMethodPattern;

public class DefaultManager extends AbstManager {

	public DefaultManager(Customer customer, Ingredient ingredient) {
		super(customer, ingredient);
	}

	@Override
	protected void finishOrder() {
		System.out.println("���� ������ �� �Ǿ� �丮�� �ʰ� �������ϴ�.");
	}

}
