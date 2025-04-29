package e01_generic;

public class GenericBoxMain {

	public static void main(String[] args) {
		GenericBox<Integer> intBox = new GenericBox<Integer>();
		intBox.setObj(300);
		System.out.println(intBox.getObj() * 3);
		//제네릭 적용시 데이터를 넣고, 꺼낼때 형변환이 필요가 없다.
		//제네릭이 적용되어 있으면, 타입이 미리 지정했기 때문
		GenericBox<Dog> dogBox = new GenericBox<>();
		dogBox.setObj(new Dog());
		dogBox.getObj().run();
	}

}
