package e04_anonymous;

public class ArmyMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("BBang!");
			}
			
			@Override
			public void reload() {
				System.out.println("Reload!");
			}
		};
		Army army = new Army(gun);

		for (int i = 0; i < 20; i++)
			army.shot();
		
		army.changeGun(new K2());

		for (int i = 0; i < 20; i++)
			army.shot();
		
		army.changeGun(new Gun() {
			private int bullet = 200;
			@Override
			public void shot() {
				bullet -=5;
				System.out.println("BangBangBangBangBang!!!");
			}
			
			@Override
			public void reload() {
				bullet = 200;
				System.out.println("reload!!");
			}
		});
		
	}

}
