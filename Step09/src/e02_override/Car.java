package e02_override;

public class Car extends Vehicle{
	@Override
	public void move() {
		System.out.println("자동차가 도로를 달립니다.");
	}
}
