package e03_super;

public class CarMain {

	public static void main(String[] args) {
		Avante car = new Avante();
		
		for(int i=0;i<200;i++)
			car.accerate();
		for(int i=0;i<100;i++)
			car.brake();
		
	}

}
