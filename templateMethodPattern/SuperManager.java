package templateMethodPattern;

public class SuperManager extends AbstManager {

	public SuperManager(Customer customer, Ingredient ingredient) {
		super(customer, ingredient);
	}

	@Override
	protected void finishOrder() {
		System.out.println("숙련된 요리사가 초스피드로 요리를 완성했습니다.");
	}

}
