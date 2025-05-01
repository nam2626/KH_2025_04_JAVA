package e04_anonymous;

public class K2 implements Gun{
	private int bullet;
	
	public K2() {
		bullet = 24;
	}
	
	@Override
	public void shot() {
		if(bullet < 3) {
			reload();
		}else {
			bullet -= 3;
			System.out.println("Bang! Bang! Bang! - 잔탄 : "+bullet);
		}
	}
	
	@Override
	public void reload() {
		bullet = 24;
		System.out.println("reload!!");
	}

}



