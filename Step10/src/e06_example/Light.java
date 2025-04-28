package e06_example;

public class Light implements Power{
	private boolean power;
	@Override
	public void powerOn() {
		System.out.println("Light 전원 On");
	}

	@Override
	public void powerOff() {
		System.out.println("Light 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Light 전원 On");
		else
			System.out.println("Light 전원 Off");
	}
	
}
