package templateMethodPattern;

public class DefaultManager extends AbstManager {

	public DefaultManager(Customer customer, Ingredient ingredient) {
		super(customer, ingredient);
	}

	@Override
	protected void finishOrder() {
		System.out.println("¾ÆÁ÷ ¼÷·ÃÀÌ ´ú µÇ¾î ¿ä¸®°¡ ´Ê°Ô ³¡³µ½À´Ï´Ù.");
	}

}
