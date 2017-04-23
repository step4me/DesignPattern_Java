package prototypePattern;

public class LemonadeImpl extends Lemonade {
	
	int price = 5000;
	int people, sum;
	@Override
	public int getCustNum() {
		return people;
	}
	@Override
	public void setCustNum(int people) {
		this.people = people;
		System.out.println("������� �湮�� �մ��� "+ people + "�� �Դϴ�.");
	}
	@Override
	public int getSales() {
		sum = people * price;
		return sum;
	}
	@Override
	public void setSales(int price, int people) {
		sum = people * price;
		System.out.println("������� �� ������ "+ sum + "�� �Դϴ�.");
	}
	
	public Lemonade copy() throws CloneNotSupportedException {
		Lemonade lemonade = (Lemonade) clone();
		
		int num = lemonade.getCustNum() + 1;
		lemonade.setCustNum(num);
		lemonade.setSales(price, num);
		
		return lemonade;
		
	}

}
