package e06_example;

public class TV implements Power{
	private boolean power;
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	
}
