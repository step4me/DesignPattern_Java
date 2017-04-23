package singletonPattern;

// Lazy Initialization 
public class KitchenGasStove {
	
	private static KitchenGasStove instance;
	private int outputPower;
	
	//�ϳ��� �ν��Ͻ��� �����ϵ���, �ܺο����� �����Լ� ȣ�� ���ϵ���, ���������ڸ� private
	private KitchenGasStove(){ 
		outputPower = 6;
	}
	
	public static KitchenGasStove getInstance(){
		if (instance == null){
			instance = new KitchenGasStove();
			System.out.println("���� ����");
		} else {
			System.out.println("�̹� ����");
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
