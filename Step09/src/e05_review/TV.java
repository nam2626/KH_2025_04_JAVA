package e05_review;

public class TV extends Appliance {
	private int channel;
	
	public TV(String brand, int channel) {
		super(brand);
		this.channel = channel;
	}
	
	@Override
	public void turnOn() {
		System.out.println(brand + " TV 전원 On");
	}
	
	@Override
	public void turnOff() {
		System.out.println(brand + " TV 전원 Off");
	}
	
	
	
}
