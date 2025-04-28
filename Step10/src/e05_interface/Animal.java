package e05_interface;

public class Animal implements Eat{

	@Override
	public void eat(String food) {
		System.out.println("동물이 " + food + "를 먹습니다.");
	}

}
