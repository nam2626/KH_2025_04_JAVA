package e04_access;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square(10,7);
		System.out.println("가로길이 : " + s1.getWidth());
		System.out.println("세로길이 : " + s1.getHeight());
		System.out.println("넓이 : " + s1.squareArea());
		System.out.println(s1.toString());
		System.out.println(s1);
	}

}
