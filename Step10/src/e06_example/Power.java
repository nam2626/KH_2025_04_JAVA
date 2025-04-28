package e06_example;

public class Power {
	protected boolean power;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	public void powerOnOff() {
		power = !power;
	}
}



