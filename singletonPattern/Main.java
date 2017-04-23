package singletonPattern;



public class Main {

	public static void main(String[] args){
		
		KitchenGasStove stove = KitchenGasStove.getInstance();
		System.out.println(stove.getPower());
		
		ConcurrentGasStove multiStove = ConcurrentGasStove.getInstance();
		System.out.println(multiStove.getPower());
		
		
	}
}
