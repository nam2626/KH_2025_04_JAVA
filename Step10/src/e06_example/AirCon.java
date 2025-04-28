package e06_example;

public class AirCon implements Power{
	private boolean power;
	@Override
	public void powerOn() {
		power = POWER_ON;
		System.out.println("AirCon 전원 On");
	}

	@Override
	public void powerOff() {
		power = POWER_OFF;
		System.out.println("AirCon 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("AirCon 전원 On");
		else
			System.out.println("AirCon 전원 Off");
	}
	
}
