package e05_interface;

public class HighStudent extends Student implements Eat {

	@Override
	public void eat(String food) {
		System.out.println("고등학생이 야자 중간에 "+food+"를 먹습니다.");
	}

	
}
