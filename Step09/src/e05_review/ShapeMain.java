package e05_review;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] arr = new Shape[3];
		arr[0] = new Triangle(5, 3);
		arr[1] = new Circle(6);
		arr[2] = new Rectangle(4, 5);
		
		for(Shape s : arr) {
			s.info();
			System.out.println(s.getArea());
		}
	}

}
