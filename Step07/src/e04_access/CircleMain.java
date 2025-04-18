package e04_access;

public class CircleMain {

	public static void main(String[] args) {
		Circle c = new Circle(4);
		
		System.out.println("원 넓이 : " + c.circleArea());
		System.out.println("원 둘레 : " + c.circumference());
		System.out.println(c);
	}

}
