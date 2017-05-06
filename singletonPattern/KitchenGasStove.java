package singletonPattern;

// Lazy Initialization 
public class KitchenGasStove {
	
	private static KitchenGasStove instance;
	private int outputPower;
	
	//하나의 인스턴스만 생성하도록, 외부에서는 생성함수 호출 못하도록, 접근제어자를 private
	private KitchenGasStove(){ 
		outputPower = 6;
	}
	//다중 쓰레드 환경에서 인스턴스가 2개 이상 생성되는 경우 발생. 이를 막기 위해 메서드 동기화
	public synchronized static KitchenGasStove getInstance(){
		if (instance == null){ //KitchenGasStove 인스턴스가 생성되었는지 검사
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
