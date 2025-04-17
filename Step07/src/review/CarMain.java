package review;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.init("벤츠", 2020, 0);
		
		for(int i = 0 ;i < 5; i++) {
			car.speedUp();
		}
		for(int i = 0 ;i < 5; i++) {
			car.speedDown();
		}
		
	}

}
