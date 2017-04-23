package strategyPattern;

public class KitchenManager {
	
	//interface
	private Management manage;
	
	public void work() {
		if (manage == null){
			System.out.println("식당 오픈 준비가 끝나지 않았습니다.");
		} else { //delegate
			manage.doWork();
		}
	}
	
	//교환 가능
	public void setManagement(Management manage){
		this.manage = manage;
	}

}
