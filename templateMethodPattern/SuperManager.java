package templateMethodPattern;

public class SuperManager extends AbstManager {

	public SuperManager(Customer customer, Ingredient ingredient) {
		super(customer, ingredient);
	}

	@Override
	protected void finishOrder() {
		System.out.println("���õ� �丮�簡 �ʽ��ǵ�� �丮�� �ϼ��߽��ϴ�.");
	}

}
