package e04_access;

public class Circle {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double getR() {	return r;	}
	public void setR(double r) { this.r = r; }
	
	public double circleArea() {
		return r * r * Math.PI;
	}
	
	public double circumference() {
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", circleArea()=" + circleArea() + ", circumference()=" + circumference() + "]";
	}
	
	
	

}
