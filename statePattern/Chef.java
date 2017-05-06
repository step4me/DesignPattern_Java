package statePattern;

public class Chef {

	private State state;
	
	public Chef(){
		state = Rest.getInstance(); //�⺻���� ���� �ִ� ����
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void cook(){
		state.cook(this);
	}
	
	public void clean(){
		state.clean(this);
	}
	
	public void rest(){
		state.rest(this);
	}
}
