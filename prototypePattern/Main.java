package prototypePattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		LemonadeImpl order1 = new LemonadeImpl();
		order1.setCustNum(3);
		
		LemonadeImpl order2 = (LemonadeImpl) order1.copy();
				
		System.out.println(order1.getCustNum());
		System.out.println(order2.getCustNum());
	}
}
