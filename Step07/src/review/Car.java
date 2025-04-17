package review;

public class Car {
	String brand;
	int year;
	int speed;
	
	void init(String b, int y, int s) {
		brand = b;
		year = y;
		speed = s;
	}
	
	void speedUp() {
		speed+=10;
		System.out.println("현재 속도 : " + speed);
	}
	
	void speedDown() {
		speed-=10;
		System.out.println("현재 속도 : " + speed);
	}

	void printCar() {
		System.out.println("브랜드 : " + brand);
		System.out.println("연식 : " + year);
		System.out.println("현재 속도 : " + speed);
	}
}
