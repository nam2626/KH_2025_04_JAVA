package e05_review;

public class ApplianceMain {
	
	public static void turnOn(Appliance app) {
		app.turnOn();
	}
	
	public static void main(String[] args) {
		turnOn(new TV("LG", 22));
		turnOn(new Washer("삼성전자", 22));
	}

}
