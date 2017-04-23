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
		System.out.println("현재까지 방문한 손님은 "+ people + "명 입니다.");
	}
	@Override
	public int getSales() {
		sum = people * price;
		return sum;
	}
	@Override
	public void setSales(int price, int people) {
		sum = people * price;
		System.out.println("현재까지 총 매출은 "+ sum + "원 입니다.");
	}
	
	public Lemonade copy() throws CloneNotSupportedException {
		Lemonade lemonade = (Lemonade) clone();
		
		int num = lemonade.getCustNum() + 1;
		lemonade.setCustNum(num);
		lemonade.setSales(price, num);
		
		return lemonade;
		
	}

}
