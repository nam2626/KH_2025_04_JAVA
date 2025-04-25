package e08_has_a;

public class ArmyMain {

	public static void main(String[] args) {
		Gun gun = new Gun();
		Army army = new Army(gun);

		for (int i = 0; i < 20; i++)
			army.shot();
		
		army.changeGun(new K2());

		for (int i = 0; i < 20; i++)
			army.shot();
		
		
	}

}
