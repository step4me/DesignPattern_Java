package singletonPattern;

/*Initialization-on-demand holder idiom
  the idiom enables a safe, highly concurrent lazy initialization with good performance.  */

public class ConcurrentGasStove {
	
	
	private int outputPower;
	
	//�ϳ��� �ν��Ͻ��� �����ϵ���, �ܺο����� �����Լ� ȣ�� ���ϵ���, ���������ڸ� private
	private ConcurrentGasStove(){ 
		outputPower = 10;
	}
	
	private static class LazyHolder {
		private static final ConcurrentGasStove INSTANCE = new ConcurrentGasStove();
	}
	
	
	public static ConcurrentGasStove getInstance(){
		System.out.println("�ν��Ͻ� ����");
		return LazyHolder.INSTANCE;
	}
	
	public int getPower(){
		return outputPower;
	}
	
	public void setPower(int outputPower){
		this.outputPower = outputPower;
	}
}
