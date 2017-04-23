package prototypePattern;

abstract class Lemonade implements Cloneable {

	public abstract int getCustNum();
	public abstract void setCustNum(int people);
	public abstract int getSales();
	public abstract void setSales(int price, int people);
	
}
