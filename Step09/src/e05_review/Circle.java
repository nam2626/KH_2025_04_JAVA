package e05_review;

public class Circle extends Shape{ 
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public void info() {
		System.out.println("원 입니다.");
	}

}
