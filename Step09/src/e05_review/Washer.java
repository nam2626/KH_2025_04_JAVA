package e05_review;

public class Washer extends Appliance{
	private int capacity;

	public Washer(String brand, int capacity) {
		super(brand);
		this.capacity = capacity;
	}
	
	@Override
	public void turnOn() {
		System.out.println(brand + " 세탁기가 켜졌습니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println(brand + " 세탁기가 꺼졌습니다.");
	}

}
