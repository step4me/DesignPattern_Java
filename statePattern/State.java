package statePattern;

public interface State {
	
	public void cook(Chef chef);
	public void clean(Chef chef);
	public void rest(Chef chef);
	
}
