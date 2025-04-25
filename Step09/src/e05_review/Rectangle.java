package e05_review;

public class Rectangle extends Shape{
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public void info() {
		System.out.println("사각형 입니다.");
	}
	

}
