package e05_interface;

public class Dog extends Animal {

	@Override
	public void eat(String food) {
		System.out.println("개가 " + food + "를 먹습니다.");
	}
}
