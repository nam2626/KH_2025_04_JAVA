package e06_example;

public class Boiler implements Power{
	private int power;
	@Override
	public void powerOn() {
		power = 1;
		System.out.println("Boiler 전원 On");
	}

	@Override
	public void powerOff() {
		power = -1;
		System.out.println("Boiler 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power *= -1;
		if(power == 1)
			System.out.println("Boiler 전원 On");
		else
			System.out.println("Boiler 전원 Off");
	}
	
}
