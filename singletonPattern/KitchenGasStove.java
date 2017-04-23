package singletonPattern;

// Lazy Initialization 
public class KitchenGasStove {
	
	private static KitchenGasStove instance;
	private int outputPower;
	
	//하나의 인스턴스만 생성하도록, 외부에서는 생성함수 호출 못하도록, 접근제어자를 private
	private KitchenGasStove(){ 
		outputPower = 6;
	}
	
	public static KitchenGasStove getInstance(){
		if (instance == null){
			instance = new KitchenGasStove();
			System.out.println("새로 생성");
		} else {
			System.out.println("이미 생성");
		}
		
		return instance;
	}

	public int getPower(){
		return outputPower;
	}
	
	public void setPower(int outputPower){
		this.outputPower = outputPower;
	}
}
