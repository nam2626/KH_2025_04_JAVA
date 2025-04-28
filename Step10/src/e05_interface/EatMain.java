package e05_interface;

public class EatMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Eat e = d;
		e.eat("생고기");
	}

}
