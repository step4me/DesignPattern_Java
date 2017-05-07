package templateMethodPattern;

public class Ingredient {
	private IngredientStatus ingredientState;
	
	public Ingredient(){
		ingredientState = IngredientStatus.ENOUGH;
	}
	
	public IngredientStatus getIngredStatus(){
		return ingredientState;
	}
	
	public void setIngredStatus(IngredientStatus ingredientStatus){
		this.ingredientState = ingredientStatus;
	}

}
