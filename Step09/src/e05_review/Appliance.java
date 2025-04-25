package e05_review;

public class Appliance {
	protected String brand;
	private int power;

	public Appliance(String brand) {
		this.brand = brand;
	}
	
	public void turnOn() {
		power = 1;
		System.out.println(brand + " 전원이 켜졌습니다.");
	}
	public void turnOff() {
		power = 0;
		System.out.println(brand + " 전원이 꺼졌습니다.");
	}
	
}
