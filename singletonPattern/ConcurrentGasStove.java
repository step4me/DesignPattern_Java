package singletonPattern;

/*Initialization-on-demand holder idiom
  the idiom enables a safe, highly concurrent lazy initialization with good performance.  */

public class ConcurrentGasStove {
	
	
	private int outputPower;
	
	//하나의 인스턴스만 생성하도록, 외부에서는 생성함수 호출 못하도록, 접근제어자를 private
	private ConcurrentGasStove(){ 
		outputPower = 10;
	}
	
	private static class LazyHolder {
		private static final ConcurrentGasStove INSTANCE = new ConcurrentGasStove();
	}
	
	
	public static ConcurrentGasStove getInstance(){
		System.out.println("인스턴스 생성");
		return LazyHolder.INSTANCE;
	}
	
	public int getPower(){
		return outputPower;
	}
	
	public void setPower(int outputPower){
		this.outputPower = outputPower;
	}
}
