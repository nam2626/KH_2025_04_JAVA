package e06_iot;

public class AirCon extends Power{

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("AirCon 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("AirCon 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if(power)
			System.out.println("AirCon 전원 On");
		else
			System.out.println("AirCon 전원 Off");
	}
	
}
